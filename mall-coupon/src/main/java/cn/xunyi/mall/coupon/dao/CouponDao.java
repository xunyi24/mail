package cn.xunyi.mall.coupon.dao;

import cn.xunyi.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author liupf
 * @email liupf24@163.com
 * @date 2020-08-01 22:42:54
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
