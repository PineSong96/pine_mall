package com.pine.mall.core.pms.entity;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Pine
 * @motto My code
 * @email 771190883@qq.com
 * @date 2020-09-23 18:16:40
 */
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@ApiModel(value = "", description = "")
public class PmsProducoperateLog implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "", name = "id")
    private Long id;
    @ApiModelProperty(value = "", name = "productId")
    private Long productId;
    @ApiModelProperty(value = "", name = "priceOld")
    private BigDecimal priceOld;
    @ApiModelProperty(value = "", name = "priceNew")
    private BigDecimal priceNew;
    @ApiModelProperty(value = "", name = "salePriceOld")
    private BigDecimal salePriceOld;
    @ApiModelProperty(value = "", name = "salePriceNew")
    private BigDecimal salePriceNew;
    @ApiModelProperty(value = "赠送的积分", name = "giftPointOld")
    private Integer giftPointOld;
    @ApiModelProperty(value = "", name = "giftPointNew")
    private Integer giftPointNew;
    @ApiModelProperty(value = "", name = "usePointLimitOld")
    private Integer usePointLimitOld;
    @ApiModelProperty(value = "", name = "usePointLimitNew")
    private Integer usePointLimitNew;
    @ApiModelProperty(value = "操作人", name = "operateMan")
    private String operateMan;
    @ApiModelProperty(value = "", name = "createTime")
    private Date createTime;

}
