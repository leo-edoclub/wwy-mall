package com.wwy.mall.pms.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wwy.core.bean.PageVo;
import com.wwy.core.bean.QueryCondition;
import com.wwy.core.bean.Resp;
import com.wwy.core.exception.RRException;
import com.wwy.mall.pms.entity.AttrEntity;
import com.wwy.mall.pms.service.AttrAttrgroupRelationService;
import com.wwy.mall.pms.service.AttrService;
import com.wwy.mall.pms.vo.AttrGroupVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang.StringUtils;
import org.bouncycastle.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.wwy.mall.pms.entity.AttrGroupEntity;
import com.wwy.mall.pms.service.AttrGroupService;




/**
 * 属性分组
 *
 * @author wangwei
 * @email leo@edoclub.cn
 * @date 2021-01-19 14:23:41
 */
@Api(tags = "属性分组 管理")
@RestController
@RequestMapping("pms/attrgroup")
public class AttrGroupController {
    @Autowired
    private AttrGroupService attrGroupService;



    @ApiOperation("查询属性组以及所包含的属性信息")
    @GetMapping("withAttr/{groupid}")
    public Resp<AttrGroupVO> queryAttrGroupWithAttrByGroupId(@PathVariable Integer groupid) {
        if (groupid == null) {
            throw new RRException("属性分组id是空，请选择分组!");
        }
        AttrGroupVO attrGroupVO = attrGroupService.queryAttrGroupWithAttrByGroupId(groupid);

        return Resp.ok(attrGroupVO);
    }

    @ApiOperation("根据分类id分页查询")
    @GetMapping("{catId}")
    public Resp<PageVo> getAttrgroupsByCatId(@PathVariable String catId,QueryCondition queryCondition) {
        if (catId == null || StringUtils.equals(catId,"")) {
            throw new RRException("分类id是空，请选择分类!");
        }
        PageVo pageVo = attrGroupService.getAttrgroupsByCatId(catId, queryCondition);

        return Resp.ok(pageVo);
    }

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = attrGroupService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{attrGroupId}")
    public Resp<AttrGroupEntity> info(@PathVariable("attrGroupId") Long attrGroupId){
		AttrGroupEntity attrGroup = attrGroupService.getById(attrGroupId);

        return Resp.ok(attrGroup);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    public Resp<Object> save(@RequestBody AttrGroupEntity attrGroup){
		attrGroupService.save(attrGroup);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    public Resp<Object> update(@RequestBody AttrGroupEntity attrGroup){
		attrGroupService.updateById(attrGroup);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    public Resp<Object> delete(@RequestBody Long[] attrGroupIds){
		attrGroupService.removeByIds(Arrays.asList(attrGroupIds));

        return Resp.ok(null);
    }

}
