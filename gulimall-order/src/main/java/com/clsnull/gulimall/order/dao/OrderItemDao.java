package com.clsnull.gulimall.order.dao;

import com.clsnull.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author luozhifa
 * @email 1334084021@qq.com
 * @date 2021-11-16 23:23:27
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
