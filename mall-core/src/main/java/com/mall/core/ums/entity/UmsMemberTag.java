package com.mall.core.ums.entity;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户标签表
 *
 * @author Pine
 * @motto My code , I understand
 * @email 771190883@qq.com
 * @date 2020-08-20 15:03:26
 */
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@ApiModel(value = "用户标签表", description = "用户标签表")
public class UmsMemberTag implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "", name = "id")
    private Long id;
    @ApiModelProperty(value = "", name = "name")
    private String name;
    @ApiModelProperty(value = "自动打标签完成订单数量", name = "finishOrderCount")
    private Integer finishOrderCount;
    @ApiModelProperty(value = "自动打标签完成订单金额", name = "finishOrderAmount")
    private BigDecimal finishOrderAmount;

}
