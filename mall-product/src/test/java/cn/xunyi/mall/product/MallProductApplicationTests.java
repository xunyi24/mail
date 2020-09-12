package cn.xunyi.mall.product;

import cn.xunyi.mall.product.entity.BrandEntity;
import cn.xunyi.mall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class MallProductApplicationTests {

    @Resource
    private BrandService brandService;
    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("Apple");

        brandService.save(brandEntity);
        System.out.println("保存成功");
    }

}
