package com.wwy.mall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wwy.mall.pms.entity.AttrEntity;
import com.wwy.core.bean.PageVo;
import com.wwy.core.bean.QueryCondition;
import com.wwy.mall.pms.vo.AttrVO;


/**
 * 商品属性
 *
 * @author wangwei
 * @email leo@edoclub.cn
 * @date 2021-01-19 14:23:41
 */
public interface AttrService extends IService<AttrEntity> {

    PageVo queryPage(QueryCondition params);

    PageVo queryAttrByCid(QueryCondition queryCondition, String cid, Integer type);

    void saveAttr(AttrVO attrVO);
}

