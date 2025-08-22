package com.xuxiaolei.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xuxiaolei.common.utils.PageUtils;
import com.xuxiaolei.gulimall.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * ??Ʒ???
 *
 * @author xuxiaolei
 * @email xudaleizi@gmail.com
 * @date 2025-08-22 09:32:31
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

