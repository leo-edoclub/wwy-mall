package com.wwy.mall.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wwy.mall.wms.entity.FeightTemplateEntity;
import com.wwy.core.bean.PageVo;
import com.wwy.core.bean.QueryCondition;


/**
 * 运费模板
 *
 * @author wangwei
 * @email leo@edoclub.cn
 * @date 2021-01-23 12:19:37
 */
public interface FeightTemplateService extends IService<FeightTemplateEntity> {

    PageVo queryPage(QueryCondition params);
}

