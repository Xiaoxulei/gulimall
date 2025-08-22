package com.xuxiaolei.gulimall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xuxiaolei.common.utils.PageUtils;
import com.xuxiaolei.common.utils.Query;

import com.xuxiaolei.gulimall.product.dao.AttrDao;
import com.xuxiaolei.gulimall.product.entity.AttrEntity;
import com.xuxiaolei.gulimall.product.service.AttrService;


@Service("attrService")
public class AttrServiceImpl extends ServiceImpl<AttrDao, AttrEntity> implements AttrService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<AttrEntity> page = this.page(
                new Query<AttrEntity>(params).getPage(),
                new QueryWrapper<AttrEntity>()
        );

        return new PageUtils(page);
    }

}