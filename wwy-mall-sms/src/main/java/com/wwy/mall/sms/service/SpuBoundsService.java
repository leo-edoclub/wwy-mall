package com.wwy.mall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wwy.mall.sms.entity.SpuBoundsEntity;
import com.wwy.core.bean.PageVo;
import com.wwy.core.bean.QueryCondition;


/**
 * 商品spu积分设置
 *
 * @author wangwei
 * @email leo@edoclub.cn
 * @date 2021-01-19 17:58:46
 */
public interface SpuBoundsService extends IService<SpuBoundsEntity> {

    PageVo queryPage(QueryCondition params);
}

