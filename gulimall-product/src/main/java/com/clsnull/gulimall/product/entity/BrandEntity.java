package com.clsnull.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

import com.clsnull.common.valid.AddGroup;
import com.clsnull.common.valid.ListValue;
import com.clsnull.common.valid.UpdateGroup;
import lombok.Data;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.*;

/**
 * 品牌
 *
 * @author luozhifa
 * @email 1334084021@qq.com
 * @date 2021-11-15 23:02:42
 */
@Data
@TableName("pms_brand")
public class BrandEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 品牌id
     */
    @NotNull(message = "未指定品牌修改Id", groups = {UpdateGroup.class})
    @Null(message = "新增不能指定Id", groups = {AddGroup.class})
    @TableId
    private Long brandId;
    /**
     * 品牌名
     */
    @NotBlank(message = "品牌名必须提交", groups = {AddGroup.class})
    private String name;
    /**
     * 品牌logo地址
     */
    @NotNull
    @URL(message = "logo必须是一个url地址", groups = {UpdateGroup.class, AddGroup.class})
    private String logo;
    /**
     * 介绍
     */
    private String descript;
    /**
     * 显示状态[0-不显示；1-显示]
     */
    @ListValue(vals = {0, 1}, message = "显示值必须为0或1",groups = {AddGroup.class})
    private Integer showStatus;
    /**
     * 检索首字母
     */
    @NotNull
    @Pattern(regexp = "^[a-zA-Z]$", message = "检索首字母必须是一个字母", groups = {UpdateGroup.class, AddGroup.class})
    private String firstLetter;
    /**
     * 排序
     */
    @NotNull
    @Min(value = 0, message = "排序必须大于等于0", groups = {UpdateGroup.class, AddGroup.class})
    private Integer sort;

}
