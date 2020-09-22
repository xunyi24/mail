package cn.xunyi.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.xunyi.common.utils.PageUtils;
import cn.xunyi.mall.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author leifengyang
 * @email leifengyang@gmail.com
 * @date 2019-10-01 21:08:49
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

