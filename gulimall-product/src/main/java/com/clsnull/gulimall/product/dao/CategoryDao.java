package com.clsnull.gulimall.product.dao;

import com.clsnull.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author luozhifa
 * @email 1334084021@qq.com
 * @date 2021-11-15 23:02:42
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
