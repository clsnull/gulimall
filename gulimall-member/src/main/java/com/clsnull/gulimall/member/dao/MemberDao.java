package com.clsnull.gulimall.member.dao;

import com.clsnull.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author luozhifa
 * @email 1334084021@qq.com
 * @date 2021-11-16 23:20:47
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
