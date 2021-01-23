/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.wwy.mall.sms.api;

import com.wwy.core.bean.Resp;
import com.wwy.mall.sms.vo.SkuSaleVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author wangwei
 * @date 2021/1/23 17:33
 */
@FeignClient("sms-service")
public interface SmsClient {

    @PostMapping("/sms/skubounds/sku/sale/save")
    public Resp<Object> saveSale(@RequestBody SkuSaleVO skuSaleVO);
}