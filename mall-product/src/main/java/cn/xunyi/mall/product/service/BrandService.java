package cn.xunyi.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.xunyi.common.utils.PageUtils;
import cn.xunyi.mall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author liupf
 * @email liupf24@163.com
 * @date 2020-08-01 15:28:56
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

