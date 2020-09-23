package com.pine.mall.core.pms.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * 产品属性分类表
 *
 * @author Pine
 * @motto My code
 * @email 771190883@qq.com
 * @date 2020-09-23 18:16:41
 */
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@ApiModel(value = "产品属性分类表", description = "产品属性分类表")
public class PmsProducattributeCategory implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "", name = "id")
    private Long id;
    @ApiModelProperty(value = "", name = "name")
    private String name;
    @ApiModelProperty(value = "属性数量", name = "attributeCount")
    private Integer attributeCount;
    @ApiModelProperty(value = "参数数量", name = "paramCount")
    private Integer paramCount;

}
