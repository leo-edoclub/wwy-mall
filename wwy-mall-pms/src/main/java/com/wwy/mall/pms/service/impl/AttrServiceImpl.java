package com.wwy.mall.pms.service.impl;

import com.wwy.mall.pms.dao.AttrAttrgroupRelationDao;
import com.wwy.mall.pms.entity.AttrAttrgroupRelationEntity;
import com.wwy.mall.pms.vo.AttrVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wwy.core.bean.PageVo;
import com.wwy.core.bean.Query;
import com.wwy.core.bean.QueryCondition;

import com.wwy.mall.pms.dao.AttrDao;
import com.wwy.mall.pms.entity.AttrEntity;
import com.wwy.mall.pms.service.AttrService;


@Service("attrService")
public class AttrServiceImpl extends ServiceImpl<AttrDao, AttrEntity> implements AttrService {

    @Autowired
    private AttrAttrgroupRelationDao attrAttrgroupRelationDao;


    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<AttrEntity> page = this.page(
                new Query<AttrEntity>().getPage(params),
                new QueryWrapper<AttrEntity>()
        );

        return new PageVo(page);
    }

    @Override
    public PageVo queryAttrByCid(QueryCondition params, String cid, Integer type) {

        QueryWrapper<AttrEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("catelog_id",cid);
        queryWrapper.eq("attr_type",type);
        IPage<AttrEntity> page = this.page(new Query<AttrEntity>().getPage(params),queryWrapper);
        return new PageVo(page);
    }

    @Override
    public void saveAttr(AttrVO attrVO) {
        this.save(attrVO);

        Long attrId = attrVO.getAttrId();
        Long attrGroupId = attrVO.getAttrGroupId();

        if(attrGroupId==null || attrGroupId.equals("")){
            return;
        }

        //插入关联表
        AttrAttrgroupRelationEntity relationEntity = new AttrAttrgroupRelationEntity();
        relationEntity.setAttrGroupId(attrGroupId);
        relationEntity.setAttrId(attrId);
        attrAttrgroupRelationDao.insert(relationEntity);

    }
}