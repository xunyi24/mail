package cn.xunyi.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.xunyi.common.utils.PageUtils;
import cn.xunyi.mall.member.entity.MemberLoginLogEntity;

import java.util.Map;

/**
 * 会员登录记录
 *
 * @author liupf
 * @email liupf24@163.com
 * @date 2020-08-01 22:55:48
 */
public interface MemberLoginLogService extends IService<MemberLoginLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

