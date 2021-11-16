package com.clsnull.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.clsnull.common.utils.PageUtils;
import com.clsnull.gulimall.member.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author luozhifa
 * @email 1334084021@qq.com
 * @date 2021-11-16 23:20:47
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

