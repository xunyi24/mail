package cn.xunyi.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.xunyi.common.utils.PageUtils;
import cn.xunyi.mall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author liupf
 * @email liupf24@163.com
 * @date 2020-08-01 23:06:25
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

