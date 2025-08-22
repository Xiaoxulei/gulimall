package com.xuxiaolei.gulimall.order.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xuxiaolei.common.utils.PageUtils;
import com.xuxiaolei.common.utils.Query;

import com.xuxiaolei.gulimall.order.dao.PaymentInfoDao;
import com.xuxiaolei.gulimall.order.entity.PaymentInfoEntity;
import com.xuxiaolei.gulimall.order.service.PaymentInfoService;


@Service("paymentInfoService")
public class PaymentInfoServiceImpl extends ServiceImpl<PaymentInfoDao, PaymentInfoEntity> implements PaymentInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PaymentInfoEntity> page = this.page(
                new Query<PaymentInfoEntity>(params).getPage(),
                new QueryWrapper<PaymentInfoEntity>()
        );

        return new PageUtils(page);
    }

}