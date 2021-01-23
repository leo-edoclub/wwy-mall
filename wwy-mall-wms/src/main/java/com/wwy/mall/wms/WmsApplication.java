/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.wwy.mall.wms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author wangwei
 * @date 2021/1/23 12:23
 */
@SpringBootApplication
@EnableDiscoveryClient
public class WmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(WmsApplication.class,args);
    }
}