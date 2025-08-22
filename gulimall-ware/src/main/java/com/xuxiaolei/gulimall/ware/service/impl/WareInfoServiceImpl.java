package com.xuxiaolei.gulimall.ware.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xuxiaolei.common.utils.PageUtils;
import com.xuxiaolei.common.utils.Query;

import com.xuxiaolei.gulimall.ware.dao.WareInfoDao;
import com.xuxiaolei.gulimall.ware.entity.WareInfoEntity;
import com.xuxiaolei.gulimall.ware.service.WareInfoService;


@Service("wareInfoService")
public class WareInfoServiceImpl extends ServiceImpl<WareInfoDao, WareInfoEntity> implements WareInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<WareInfoEntity> page = this.page(
                new Query<WareInfoEntity>(params).getPage(),
                new QueryWrapper<WareInfoEntity>()
        );

        return new PageUtils(page);
    }

}