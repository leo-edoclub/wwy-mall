package com.wwy.mall.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wwy.mall.wms.entity.WareOrderTaskDetailEntity;
import com.wwy.core.bean.PageVo;
import com.wwy.core.bean.QueryCondition;


/**
 * 库存工作单
 *
 * @author wangwei
 * @email leo@edoclub.cn
 * @date 2021-01-23 12:19:37
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageVo queryPage(QueryCondition params);
}

