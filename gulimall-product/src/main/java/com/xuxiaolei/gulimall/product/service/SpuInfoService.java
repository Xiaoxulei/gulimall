package com.xuxiaolei.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xuxiaolei.common.utils.PageUtils;
import com.xuxiaolei.gulimall.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu??Ϣ
 *
 * @author xuxiaolei
 * @email xudaleizi@gmail.com
 * @date 2025-08-22 09:32:31
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

