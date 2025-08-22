package com.xuxiaolei.gulimall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xuxiaolei.common.utils.PageUtils;
import com.xuxiaolei.common.utils.Query;

import com.xuxiaolei.gulimall.product.dao.CategoryDao;
import com.xuxiaolei.gulimall.product.entity.CategoryEntity;
import com.xuxiaolei.gulimall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>(params).getPage(),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        //查询所有
        List<CategoryEntity> list = list();
        //找到一级分类
        List<CategoryEntity> levelOneMenus = list.stream().filter(categoryEntity ->
           categoryEntity.getParentCid() == 0
        ).collect(Collectors.toList());
        return levelOneMenus;
    }

}