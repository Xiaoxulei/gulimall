package com.xuxiaolei.gulimall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.*;
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
        List<CategoryEntity> allCategories = list();
        /*//找到一级分类
        List<CategoryEntity> levelOneMenus = list.stream().filter(categoryEntity ->
           categoryEntity.getParentCid() == 0
        ).collect(Collectors.toList());*/

//        List<CategoryEntity> tree = buildCategoryTree(allCategories);
        return buildCategoryTree(allCategories);

    }

    public List<CategoryEntity> buildCategoryTree(List<CategoryEntity> all) {
        // 1. 按 parentCid 分组，减少递归时全表扫描
        Map<Long, List<CategoryEntity>> parentMap = all.stream()
                .collect(Collectors.groupingBy(CategoryEntity::getParentCid));

        // 2. 构建树 & 排序
        return all.stream()
                .filter(cat -> cat.getParentCid() == 0)
                .peek(cat -> cat.setChildren(getChildren(cat.getCatId(), parentMap)))
                .sorted(Comparator.comparingInt(c -> Optional.ofNullable(c.getSort()).orElse(0)))
                .collect(Collectors.toList());
    }

    private List<CategoryEntity> getChildren(Long parentId, Map<Long, List<CategoryEntity>> parentMap) {
        List<CategoryEntity> children = parentMap.getOrDefault(parentId, new ArrayList<>());

        children.forEach(child -> child.setChildren(getChildren(child.getCatId(), parentMap)));
        children.sort(Comparator.comparingInt(c -> Optional.ofNullable(c.getSort()).orElse(0)));

        return children;
    }


}