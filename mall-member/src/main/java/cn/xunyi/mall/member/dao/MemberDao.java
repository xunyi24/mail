package cn.xunyi.mall.member.dao;

import cn.xunyi.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author liupf
 * @email liupf24@163.com
 * @date 2020-08-01 22:55:49
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
