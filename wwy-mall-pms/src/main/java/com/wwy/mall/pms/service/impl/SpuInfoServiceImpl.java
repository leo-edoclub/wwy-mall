package com.wwy.mall.pms.service.impl;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wwy.core.bean.PageVo;
import com.wwy.core.bean.Query;
import com.wwy.core.bean.QueryCondition;

import com.wwy.mall.pms.dao.SpuInfoDao;
import com.wwy.mall.pms.entity.SpuInfoEntity;
import com.wwy.mall.pms.service.SpuInfoService;


@Service("spuInfoService")
public class SpuInfoServiceImpl extends ServiceImpl<SpuInfoDao, SpuInfoEntity> implements SpuInfoService {

    @Override
    public PageVo queryPage(QueryCondition params,Long catId,String key) {

        QueryWrapper<SpuInfoEntity> wrapper = new QueryWrapper<>();
        if (catId != null) {
            wrapper.eq("catalog_id",catId);
        }
        if (StringUtils.isNotEmpty(key)) {
            wrapper.and(e->e.eq("id",key).or().like("",key));
        }
        IPage<SpuInfoEntity> page = this.page(new Query<SpuInfoEntity>().getPage(params), wrapper);

        return new PageVo(page);
    }

}