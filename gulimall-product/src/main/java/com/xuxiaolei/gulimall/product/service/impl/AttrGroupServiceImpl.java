package com.xuxiaolei.gulimall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xuxiaolei.common.utils.PageUtils;
import com.xuxiaolei.common.utils.Query;

import com.xuxiaolei.gulimall.product.dao.AttrGroupDao;
import com.xuxiaolei.gulimall.product.entity.AttrGroupEntity;
import com.xuxiaolei.gulimall.product.service.AttrGroupService;


@Service("attrGroupService")
public class AttrGroupServiceImpl extends ServiceImpl<AttrGroupDao, AttrGroupEntity> implements AttrGroupService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<AttrGroupEntity> page = this.page(
                new Query<AttrGroupEntity>(params).getPage(),
                new QueryWrapper<AttrGroupEntity>()
        );

        return new PageUtils(page);
    }

}