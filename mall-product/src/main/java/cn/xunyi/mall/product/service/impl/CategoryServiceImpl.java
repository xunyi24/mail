package cn.xunyi.mall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.xunyi.common.utils.PageUtils;
import cn.xunyi.common.utils.Query;

import cn.xunyi.mall.product.dao.CategoryDao;
import cn.xunyi.mall.product.entity.CategoryEntity;
import cn.xunyi.mall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        //不传入查询条件就是查询所有
        List<CategoryEntity> entities = baseMapper.selectList(null);
        return entities;
    }

    @Override
    public void removeMenuByIds(List<Long> asList) {
        //TODO 检查当前删除的菜单是否被别的地方引用
        baseMapper.deleteBatchIds(asList);

        //逻辑删除
    }

}
