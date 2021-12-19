package com.clsnull.gulimall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.clsnull.common.utils.PageUtils;
import com.clsnull.common.utils.Query;

import com.clsnull.gulimall.product.dao.CategoryDao;
import com.clsnull.gulimall.product.entity.CategoryEntity;
import com.clsnull.gulimall.product.service.CategoryService;


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
    public List<CategoryEntity> getListTree() {

        List<CategoryEntity> entities = baseMapper.selectList(null);

        List<CategoryEntity> list = entities.stream().filter(item -> {
            //过滤查出1级分类
            return item.getParentCid().equals(0L);
        }).map(peek -> {
            //查出子类
            List<CategoryEntity> childrens = getChildrens(peek, entities);
            peek.setChildrens(childrens);
            return peek;
        }).sorted((item1, item2) -> {
            //排序
            return item2.getSort() - item1.getSort();
        }).collect(Collectors.toList());
        return list;
    }

    private List<CategoryEntity> getChildrens(CategoryEntity root, List<CategoryEntity> entities) {
        List<CategoryEntity> list = entities.stream().filter(item -> {
            return item.getParentCid().equals(root.getCatId());
        }).map(peek -> {
            List<CategoryEntity> childrens = getChildrens(peek, entities);
            peek.setChildrens(childrens);
            return peek;
        }).sorted((item1, item2) -> {
            return item2.getSort() - item1.getSort();
        }).collect(Collectors.toList());
        return list;
    }

    @Override
    public void removeCategoryByIds(List<Long> ids) {
        //TODO 1.
        baseMapper.deleteBatchIds(ids);
    }
}