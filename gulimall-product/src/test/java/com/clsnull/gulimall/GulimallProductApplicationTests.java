package com.clsnull.gulimall;

import com.clsnull.gulimall.product.entity.BrandEntity;
import com.clsnull.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    public BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();

        brandEntity.setName("XIMOMI");
        brandService.save(brandEntity);
    }

}
