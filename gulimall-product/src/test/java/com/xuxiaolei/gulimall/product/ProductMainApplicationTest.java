package com.xuxiaolei.gulimall.product;

import com.xuxiaolei.common.utils.R;
import com.xuxiaolei.gulimall.product.entity.BrandEntity;
import com.xuxiaolei.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author: xuxiaolei
 * @Description: TODO:
 * @CreatTime: 2025/08/22 10:20
 **/
@SpringBootTest
public class ProductMainApplicationTest {
    @Autowired
    private BrandService brandService;
    @Test
    void test(){
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("MEIZU");
        brandService.save(brandEntity);
        System.out.println(R.ok("保存成功......"));
    }
}
