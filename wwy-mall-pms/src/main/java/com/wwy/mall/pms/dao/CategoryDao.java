package com.wwy.mall.pms.dao;

import com.wwy.mall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author wangwei
 * @email leo@edoclub.cn
 * @date 2021-01-19 14:23:41
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
