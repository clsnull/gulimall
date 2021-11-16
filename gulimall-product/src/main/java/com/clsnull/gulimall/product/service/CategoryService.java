package com.clsnull.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.clsnull.common.utils.PageUtils;
import com.clsnull.gulimall.product.entity.CategoryEntity;

import java.util.Map;

/**
 * 商品三级分类
 *
 * @author luozhifa
 * @email 1334084021@qq.com
 * @date 2021-11-15 23:02:42
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

