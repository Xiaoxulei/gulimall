package com.xuxiaolei.gulimall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: xuxiaolei
 * @Description: TODO: ${description}
 * @CreatTime: 2025/08/22 11:02
 **/
@EnableDiscoveryClient
@SpringBootApplication
public class CouponMainApplication {
    public static void main(String[] args) {
       SpringApplication.run(CouponMainApplication.class, args);
    }
}