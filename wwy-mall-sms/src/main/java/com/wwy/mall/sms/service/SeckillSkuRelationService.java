package com.wwy.mall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wwy.mall.sms.entity.SeckillSkuRelationEntity;
import com.wwy.core.bean.PageVo;
import com.wwy.core.bean.QueryCondition;


/**
 * 秒杀活动商品关联
 *
 * @author wangwei
 * @email leo@edoclub.cn
 * @date 2021-01-19 17:58:46
 */
public interface SeckillSkuRelationService extends IService<SeckillSkuRelationEntity> {

    PageVo queryPage(QueryCondition params);
}

