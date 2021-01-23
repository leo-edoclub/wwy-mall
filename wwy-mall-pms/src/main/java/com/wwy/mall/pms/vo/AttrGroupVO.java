/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.wwy.mall.pms.vo;

import com.wwy.mall.pms.entity.AttrAttrgroupRelationEntity;
import com.wwy.mall.pms.entity.AttrEntity;
import com.wwy.mall.pms.entity.AttrGroupEntity;
import lombok.Data;

import java.util.List;

/**
 * @author wangwei
 * @date 2021/1/22 14:02
 */
@Data
public class AttrGroupVO extends AttrGroupEntity {

    private List<AttrEntity> attrEntities;
    private List<AttrAttrgroupRelationEntity> relationEntities;
}