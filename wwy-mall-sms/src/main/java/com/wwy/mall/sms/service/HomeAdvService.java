package com.wwy.mall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wwy.mall.sms.entity.HomeAdvEntity;
import com.wwy.core.bean.PageVo;
import com.wwy.core.bean.QueryCondition;


/**
 * 首页轮播广告
 *
 * @author wangwei
 * @email leo@edoclub.cn
 * @date 2021-01-19 17:58:46
 */
public interface HomeAdvService extends IService<HomeAdvEntity> {

    PageVo queryPage(QueryCondition params);
}

