package com.wwy.mall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wwy.mall.pms.entity.CategoryEntity;
import com.wwy.core.bean.PageVo;
import com.wwy.core.bean.QueryCondition;

import java.util.List;


/**
 * 商品三级分类
 *
 * @author wangwei
 * @email leo@edoclub.cn
 * @date 2021-01-19 14:23:41
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageVo queryPage(QueryCondition params);

    List<CategoryEntity> querryCategoryByPidOrLevel(Integer level, Integer pid);
}

