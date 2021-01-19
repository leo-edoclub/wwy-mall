package com.wwy.mall.sms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wwy.core.bean.PageVo;
import com.wwy.core.bean.Query;
import com.wwy.core.bean.QueryCondition;

import com.wwy.mall.sms.dao.SpuBoundsDao;
import com.wwy.mall.sms.entity.SpuBoundsEntity;
import com.wwy.mall.sms.service.SpuBoundsService;


@Service("spuBoundsService")
public class SpuBoundsServiceImpl extends ServiceImpl<SpuBoundsDao, SpuBoundsEntity> implements SpuBoundsService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<SpuBoundsEntity> page = this.page(
                new Query<SpuBoundsEntity>().getPage(params),
                new QueryWrapper<SpuBoundsEntity>()
        );

        return new PageVo(page);
    }

}