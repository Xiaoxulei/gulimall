package com.xuxiaolei.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xuxiaolei.common.utils.PageUtils;
import com.xuxiaolei.gulimall.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * ???Է??
 *
 * @author xuxiaolei
 * @email xudaleizi@gmail.com
 * @date 2025-08-22 09:32:31
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

