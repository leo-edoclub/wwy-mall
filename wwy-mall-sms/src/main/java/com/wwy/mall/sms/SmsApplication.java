/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.wwy.mall.sms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author wangwei
 * @date 2021/1/19 10:35
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.wwy.mall.sms.dao")
public class SmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmsApplication.class,args);
    }
}