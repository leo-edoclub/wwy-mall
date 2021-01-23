package com.wwy.mall.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wwy.mall.wms.entity.ShAreaEntity;
import com.wwy.core.bean.PageVo;
import com.wwy.core.bean.QueryCondition;


/**
 * 全国省市区信息
 *
 * @author wangwei
 * @email leo@edoclub.cn
 * @date 2021-01-23 12:19:37
 */
public interface ShAreaService extends IService<ShAreaEntity> {

    PageVo queryPage(QueryCondition params);
}

