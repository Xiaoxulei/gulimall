package com.xuxiaolei.gulimall.order.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xuxiaolei.common.utils.PageUtils;
import com.xuxiaolei.common.utils.Query;

import com.xuxiaolei.gulimall.order.dao.OrderSettingDao;
import com.xuxiaolei.gulimall.order.entity.OrderSettingEntity;
import com.xuxiaolei.gulimall.order.service.OrderSettingService;


@Service("orderSettingService")
public class OrderSettingServiceImpl extends ServiceImpl<OrderSettingDao, OrderSettingEntity> implements OrderSettingService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OrderSettingEntity> page = this.page(
                new Query<OrderSettingEntity>(params).getPage(),
                new QueryWrapper<OrderSettingEntity>()
        );

        return new PageUtils(page);
    }

}