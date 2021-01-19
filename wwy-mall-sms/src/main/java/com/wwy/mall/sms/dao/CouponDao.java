package com.wwy.mall.sms.dao;

import com.wwy.mall.sms.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author wangwei
 * @email leo@edoclub.cn
 * @date 2021-01-19 17:58:46
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
