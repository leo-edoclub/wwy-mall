package com.wwy.mall.pms.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wwy.core.bean.PageVo;
import com.wwy.core.bean.Query;
import com.wwy.core.bean.QueryCondition;

import com.wwy.mall.pms.dao.CategoryDao;
import com.wwy.mall.pms.entity.CategoryEntity;
import com.wwy.mall.pms.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageVo(page);
    }

    @Override
    public List<CategoryEntity> querryCategoryByPidOrLevel(Integer level, Integer pid) {
        QueryWrapper<CategoryEntity> queryWrapper = new QueryWrapper<>();

        if(level != 0) {
            queryWrapper.eq("cat_level",level);
        }
        if (pid != null) {
            queryWrapper.eq("parent_cid",pid);
        }

        return this.baseMapper.selectList(queryWrapper);
    }

}