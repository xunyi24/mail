package cn.xunyi.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.xunyi.common.utils.PageUtils;
import cn.xunyi.mall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author liupf
 * @email liupf24@163.com
 * @date 2020-08-01 22:55:49
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

