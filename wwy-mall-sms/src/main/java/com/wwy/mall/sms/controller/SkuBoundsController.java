package com.wwy.mall.sms.controller;

import java.util.Arrays;
import java.util.Map;


import com.wwy.core.bean.PageVo;
import com.wwy.core.bean.QueryCondition;
import com.wwy.core.bean.Resp;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.wwy.mall.sms.entity.SkuBoundsEntity;
import com.wwy.mall.sms.service.SkuBoundsService;




/**
 * 商品sku积分设置
 *
 * @author wangwei
 * @email leo@edoclub.cn
 * @date 2021-01-19 17:58:46
 */
@Api(tags = "商品sku积分设置 管理")
@RestController
@RequestMapping("sms/skubounds")
public class SkuBoundsController {
    @Autowired
    private SkuBoundsService skuBoundsService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = skuBoundsService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    public Resp<SkuBoundsEntity> info(@PathVariable("id") Long id){
		SkuBoundsEntity skuBounds = skuBoundsService.getById(id);

        return Resp.ok(skuBounds);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    public Resp<Object> save(@RequestBody SkuBoundsEntity skuBounds){
		skuBoundsService.save(skuBounds);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    public Resp<Object> update(@RequestBody SkuBoundsEntity skuBounds){
		skuBoundsService.updateById(skuBounds);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    public Resp<Object> delete(@RequestBody Long[] ids){
		skuBoundsService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
