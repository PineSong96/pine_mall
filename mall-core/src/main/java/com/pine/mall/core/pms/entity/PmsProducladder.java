package com.pine.mall.core.pms.entity;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * 产品阶梯价格表(只针对同商品)
 *
 * @author Pine
 * @motto My code
 * @email 771190883@qq.com
 * @date 2020-09-23 18:16:41
 */
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@ApiModel(value = "产品阶梯价格表(只针对同商品)", description = "产品阶梯价格表(只针对同商品)")
public class PmsProducladder implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "", name = "id")
    private Long id;
    @ApiModelProperty(value = "", name = "productId")
    private Long productId;
    @ApiModelProperty(value = "满足的商品数量", name = "count")
    private Integer count;
    @ApiModelProperty(value = "折扣", name = "discount")
    private BigDecimal discount;
    @ApiModelProperty(value = "折后价格", name = "price")
    private BigDecimal price;

}
