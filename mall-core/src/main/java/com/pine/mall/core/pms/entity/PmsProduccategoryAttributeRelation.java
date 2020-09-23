package com.pine.mall.core.pms.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * 产品的分类和属性的关系表，用于设置分类筛选条件（只支持一级分类）
 *
 * @author Pine
 * @motto My code
 * @email 771190883@qq.com
 * @date 2020-09-23 18:16:41
 */
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@ApiModel(value = "产品的分类和属性的关系表，用于设置分类筛选条件（只支持一级分类）", description = "产品的分类和属性的关系表，用于设置分类筛选条件（只支持一级分类）")
public class PmsProduccategoryAttributeRelation implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "", name = "id")
    private Long id;
    @ApiModelProperty(value = "", name = "productCategoryId")
    private Long productCategoryId;
    @ApiModelProperty(value = "", name = "productAttributeId")
    private Long productAttributeId;

}
