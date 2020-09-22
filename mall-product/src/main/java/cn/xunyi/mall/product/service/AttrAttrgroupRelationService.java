package cn.xunyi.mall.product.service;

import cn.xunyi.mall.product.vo.*;
import com.baomidou.mybatisplus.extension.service.IService;
import cn.xunyi.common.utils.PageUtils;
import cn.xunyi.mall.product.entity.AttrAttrgroupRelationEntity;

import java.util.List;
import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author leifengyang
 * @email leifengyang@gmail.com
 * @date 2019-10-01 21:08:49
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveBatch(List<AttrGroupRelationVo> vos);

}

