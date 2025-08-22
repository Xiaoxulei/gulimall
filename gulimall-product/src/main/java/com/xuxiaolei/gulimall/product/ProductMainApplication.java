package com.xuxiaolei.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: xuxiaolei
 * @Description: TODO: ${description}
 * @CreatTime: 2025/08/21 14:55
 **/
@SpringBootApplication
@MapperScan("com.xuxiaolei.gulimall.product.dao")
public class ProductMainApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductMainApplication.class, args);
    }
}