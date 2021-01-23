package com.wwy.mall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wwy.mall.pms.entity.AttrGroupEntity;
import com.wwy.core.bean.PageVo;
import com.wwy.core.bean.QueryCondition;
import com.wwy.mall.pms.vo.AttrGroupVO;


/**
 * 属性分组
 *
 * @author wangwei
 * @email leo@edoclub.cn
 * @date 2021-01-19 14:23:41
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageVo queryPage(QueryCondition params);

    PageVo getAttrgroupsByCatId(String catId ,QueryCondition params);

    AttrGroupVO queryAttrGroupWithAttrByGroupId(Integer groupid);
}

