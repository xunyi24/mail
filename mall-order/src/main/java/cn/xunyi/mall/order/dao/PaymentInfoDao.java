package cn.xunyi.mall.order.dao;

import cn.xunyi.mall.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author liupf
 * @email liupf24@163.com
 * @date 2020-08-01 23:06:25
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
