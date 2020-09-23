package com.pine.mall.core.pms.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * 存储产品参数信息的表
 *
 * @author Pine
 * @motto My code
 * @email 771190883@qq.com
 * @date 2020-09-23 18:16:41
 */
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@ApiModel(value = "存储产品参数信息的表", description = "存储产品参数信息的表")
public class PmsProducattributeValue implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "", name = "id")
    private Long id;
    @ApiModelProperty(value = "", name = "productId")
    private Long productId;
    @ApiModelProperty(value = "", name = "productAttributeId")
    private Long productAttributeId;
    @ApiModelProperty(value = "手动添加规格或参数的值，参数单值，规格有多个时以逗号隔开", name = "value")
    private String value;

}
