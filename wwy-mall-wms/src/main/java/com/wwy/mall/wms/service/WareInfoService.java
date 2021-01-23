package com.wwy.mall.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wwy.mall.wms.entity.WareInfoEntity;
import com.wwy.core.bean.PageVo;
import com.wwy.core.bean.QueryCondition;


/**
 * 仓库信息
 *
 * @author wangwei
 * @email leo@edoclub.cn
 * @date 2021-01-23 12:19:37
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageVo queryPage(QueryCondition params);
}

