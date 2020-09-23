package com.pine.mall.core.pms.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * 产品分类
 *
 * @author Pine
 * @motto My code
 * @email 771190883@qq.com
 * @date 2020-09-23 18:16:41
 */
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@ApiModel(value = "产品分类", description = "产品分类")
public class PmsProduccategory implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "", name = "id")
    private Long id;
    @ApiModelProperty(value = "上机分类的编号：0表示一级分类", name = "parentId")
    private Long parentId;
    @ApiModelProperty(value = "", name = "name")
    private String name;
    @ApiModelProperty(value = "分类级别：0->1级；1->2级", name = "level")
    private Integer level;
    @ApiModelProperty(value = "", name = "productCount")
    private Integer productCount;
    @ApiModelProperty(value = "", name = "productUnit")
    private String productUnit;
    @ApiModelProperty(value = "是否显示在导航栏：0->不显示；1->显示", name = "navStatus")
    private Integer navStatus;
    @ApiModelProperty(value = "显示状态：0->不显示；1->显示", name = "showStatus")
    private Integer showStatus;
    @ApiModelProperty(value = "", name = "sort")
    private Integer sort;
    @ApiModelProperty(value = "图标", name = "icon")
    private String icon;
    @ApiModelProperty(value = "", name = "keywords")
    private String keywords;
    @ApiModelProperty(value = "描述", name = "description")
    private String description;

}
