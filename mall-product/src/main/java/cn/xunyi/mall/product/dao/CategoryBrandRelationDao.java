package cn.xunyi.mall.product.dao;

import cn.xunyi.mall.product.entity.CategoryBrandRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 品牌分类关联
 *
 * @author liupf
 * @email liupf24@163.com
 * @date 2020-08-01 15:28:56
 */
@Mapper
public interface CategoryBrandRelationDao extends BaseMapper<CategoryBrandRelationEntity> {
	void updateCategory(Long catId, String name);
}
