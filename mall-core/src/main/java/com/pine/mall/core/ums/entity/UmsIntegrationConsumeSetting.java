package com.pine.mall.core.ums.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * 积分消费设置
 *
 * @author Pine
 * @motto My code , I understand
 * @email 771190883@qq.com
 * @date 2020-08-20 15:03:26
 */
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@ApiModel(value = "积分消费设置", description = "积分消费设置")
public class UmsIntegrationConsumeSetting implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "", name = "id")
    private Long id;
    @ApiModelProperty(value = "每一元需要抵扣的积分数量", name = "deductionPerAmount")
    private Integer deductionPerAmount;
    @ApiModelProperty(value = "每笔订单最高抵用百分比", name = "maxPercentPerOrder")
    private Integer maxPercentPerOrder;
    @ApiModelProperty(value = "每次使用积分最小单位100", name = "useUnit")
    private Integer useUnit;
    @ApiModelProperty(value = "是否可以和优惠券同用；0->不可以；1->可以", name = "couponStatus")
    private Integer couponStatus;

}
