package com.clsnull.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.clsnull.common.utils.PageUtils;
import com.clsnull.gulimall.order.entity.PaymentInfoEntity;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author luozhifa
 * @email 1334084021@qq.com
 * @date 2021-11-16 23:23:27
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

