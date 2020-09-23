package com.pine.mall.core.pms.entity;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * 产品满减表(只针对同商品)
 *
 * @author Pine
 * @motto My code
 * @email 771190883@qq.com
 * @date 2020-09-23 18:16:41
 */
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@ApiModel(value = "产品满减表(只针对同商品)", description = "产品满减表(只针对同商品)")
public class PmsProducfullReduction implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "", name = "id")
    private Long id;
    @ApiModelProperty(value = "", name = "productId")
    private Long productId;
    @ApiModelProperty(value = "", name = "fullPrice")
    private BigDecimal fullPrice;
    @ApiModelProperty(value = "", name = "reducePrice")
    private BigDecimal reducePrice;

}
