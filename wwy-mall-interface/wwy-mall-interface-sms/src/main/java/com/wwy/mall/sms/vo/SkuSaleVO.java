/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.wwy.mall.sms.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author wangwei
 * @date 2021/1/23 17:27
 */
@Data
public class SkuSaleVO {

    //积分营销相关字段
    private BigDecimal growBounds;
    private BigDecimal buyBounds;
    private List<Integer> work;


    //打折相关字段
    private  Integer fullCount;
    private BigDecimal discount;
    private Integer ladderAddOther;


    //满减相关字段
    private  BigDecimal fullPrice;
    private BigDecimal reducePrice;
    private Integer fullAddOther;
}