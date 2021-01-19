package com.wwy.mall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wwy.mall.sms.entity.CouponEntity;
import com.wwy.core.bean.PageVo;
import com.wwy.core.bean.QueryCondition;


/**
 * 优惠券信息
 *
 * @author wangwei
 * @email leo@edoclub.cn
 * @date 2021-01-19 17:58:46
 */
public interface CouponService extends IService<CouponEntity> {

    PageVo queryPage(QueryCondition params);
}

