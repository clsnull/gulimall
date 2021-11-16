package com.clsnull.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.clsnull.common.utils.PageUtils;
import com.clsnull.gulimall.coupon.entity.SkuLadderEntity;

import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author luozhifa
 * @email 1334084021@qq.com
 * @date 2021-11-16 23:15:13
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

