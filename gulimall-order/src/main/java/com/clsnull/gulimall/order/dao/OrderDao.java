package com.clsnull.gulimall.order.dao;

import com.clsnull.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author luozhifa
 * @email 1334084021@qq.com
 * @date 2021-11-16 23:23:27
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
