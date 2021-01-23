package com.wwy.mall.pms.service.impl;

import com.wwy.mall.pms.dao.AttrAttrgroupRelationDao;
import com.wwy.mall.pms.dao.AttrDao;
import com.wwy.mall.pms.entity.AttrAttrgroupRelationEntity;
import com.wwy.mall.pms.entity.AttrEntity;
import com.wwy.mall.pms.vo.AttrGroupVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wwy.core.bean.PageVo;
import com.wwy.core.bean.Query;
import com.wwy.core.bean.QueryCondition;

import com.wwy.mall.pms.dao.AttrGroupDao;
import com.wwy.mall.pms.entity.AttrGroupEntity;
import com.wwy.mall.pms.service.AttrGroupService;
import org.springframework.util.CollectionUtils;


@Service("attrGroupService")
public class AttrGroupServiceImpl extends ServiceImpl<AttrGroupDao, AttrGroupEntity> implements AttrGroupService {

    @Autowired
    private AttrAttrgroupRelationDao attrAttrgroupRelationDao;
    @Autowired
    private AttrDao attrDao;

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<AttrGroupEntity> page = this.page(
                new Query<AttrGroupEntity>().getPage(params),
                new QueryWrapper<AttrGroupEntity>()
        );

        return new PageVo(page);
    }

    @Override
    public PageVo getAttrgroupsByCatId(String catId,QueryCondition params) {
        QueryWrapper<AttrGroupEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("catelog_id",catId);
        IPage<AttrGroupEntity> page = this.page(new Query<AttrGroupEntity>().getPage(params),queryWrapper);
        return new PageVo(page);
    }

    @Override
    public AttrGroupVO queryAttrGroupWithAttrByGroupId(Integer groupid) {

        //查询属性组信息
        AttrGroupVO attrGroupVO = new AttrGroupVO();
        AttrGroupEntity attrGroupEntity = this.baseMapper.selectById(groupid);
        BeanUtils.copyProperties(attrGroupEntity,attrGroupVO);

        //查询关联关系信息
        QueryWrapper<AttrAttrgroupRelationEntity> attrAttrgroupRelationEntityQueryWrapper = new QueryWrapper<>();
        attrAttrgroupRelationEntityQueryWrapper.eq("attr_group_id", groupid);
        List<AttrAttrgroupRelationEntity> attrAttrgroupRelationEntities = attrAttrgroupRelationDao.selectList(attrAttrgroupRelationEntityQueryWrapper);
        if (CollectionUtils.isEmpty(attrAttrgroupRelationEntities)) {
            return  attrGroupVO;
        }
        attrGroupVO.setRelationEntities(attrAttrgroupRelationEntities);

        //根据关联关系查询属性信息
        QueryWrapper<AttrEntity> attrEntityQueryWrapper = new QueryWrapper<>();
        //尽量走单表查询
//        attrEntityQueryWrapper.inSql("attr_id","select a.attr_id from pms_attr_attrgroup_relation a where a.attr_group_id="+groupid);
//        List<AttrEntity> attrEntities = attrDao.selectList(attrEntityQueryWrapper);
        List<Long> ids = attrAttrgroupRelationEntities.stream().map(e -> e.getAttrId()).collect(Collectors.toList());
        List<AttrEntity> attrEntities = attrDao.selectBatchIds(ids);
        attrGroupVO.setAttrEntities(attrEntities);


        return attrGroupVO;
    }

}