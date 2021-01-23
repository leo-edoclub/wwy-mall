package com.wwy.mall.wms.dao;

import com.wwy.mall.wms.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author wangwei
 * @email leo@edoclub.cn
 * @date 2021-01-23 12:19:37
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
