package com.clsnull.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.clsnull.common.utils.PageUtils;
import com.clsnull.gulimall.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author luozhifa
 * @email 1334084021@qq.com
 * @date 2021-11-15 23:02:41
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

