package com.xuxiaolei.gulimall.ware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: xuxiaolei
 * @Description: TODO: ${description}
 * @CreatTime: 2025/08/21 16:04
 **/
@EnableDiscoveryClient
@SpringBootApplication
public class WareMainApplication {
    public static void main(String[] args) {
        SpringApplication.run(WareMainApplication.class, args);
    }
}