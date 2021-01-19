package com.wwy.mall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wwy.mall.sms.entity.CouponSpuRelationEntity;
import com.wwy.core.bean.PageVo;
import com.wwy.core.bean.QueryCondition;


/**
 * 优惠券与产品关联
 *
 * @author wangwei
 * @email leo@edoclub.cn
 * @date 2021-01-19 17:58:46
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelationEntity> {

    PageVo queryPage(QueryCondition params);
}

