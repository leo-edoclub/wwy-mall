package com.wwy.mall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wwy.mall.pms.entity.SpuInfoEntity;
import com.wwy.core.bean.PageVo;
import com.wwy.core.bean.QueryCondition;


/**
 * spu信息
 *
 * @author wangwei
 * @email leo@edoclub.cn
 * @date 2021-01-19 14:23:41
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageVo queryPage(QueryCondition params,Long catId,String key);
}

