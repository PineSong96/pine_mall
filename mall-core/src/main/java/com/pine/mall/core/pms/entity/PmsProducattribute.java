package com.pine.mall.core.pms.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * 商品属性参数表
 *
 * @author Pine
 * @motto My code
 * @email 771190883@qq.com
 * @date 2020-09-23 18:16:42
 */
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@ApiModel(value = "商品属性参数表", description = "商品属性参数表")
public class PmsProducattribute implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "", name = "id")
    private Long id;
    @ApiModelProperty(value = "", name = "productAttributeCategoryId")
    private Long productAttributeCategoryId;
    @ApiModelProperty(value = "", name = "name")
    private String name;
    @ApiModelProperty(value = "属性选择类型：0->唯一；1->单选；2->多选", name = "selectType")
    private Integer selectType;
    @ApiModelProperty(value = "属性录入方式：0->手工录入；1->从列表中选取", name = "inputType")
    private Integer inputType;
    @ApiModelProperty(value = "可选值列表，以逗号隔开", name = "inputList")
    private String inputList;
    @ApiModelProperty(value = "排序字段：最高的可以单独上传图片", name = "sort")
    private Integer sort;
    @ApiModelProperty(value = "分类筛选样式：1->普通；1->颜色", name = "filterType")
    private Integer filterType;
    @ApiModelProperty(value = "检索类型；0->不需要进行检索；1->关键字检索；2->范围检索", name = "searchType")
    private Integer searchType;
    @ApiModelProperty(value = "相同属性产品是否关联；0->不关联；1->关联", name = "relatedStatus")
    private Integer relatedStatus;
    @ApiModelProperty(value = "是否支持手动新增；0->不支持；1->支持", name = "handAddStatus")
    private Integer handAddStatus;
    @ApiModelProperty(value = "属性的类型；0->规格；1->参数", name = "type")
    private Integer type;

}
