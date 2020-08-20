package com.mall.core.ums.entity;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * 会员积分成长规则表
 *
 * @author Pine
 * @motto My code , I understand
 * @email 771190883@qq.com
 * @date 2020-08-20 15:03:26
 */
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@ApiModel(value = "会员积分成长规则表", description = "会员积分成长规则表")
public class UmsMemberRuleSetting implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "", name = "id")
    private Long id;
    @ApiModelProperty(value = "连续签到天数", name = "continueSignDay")
    private Integer continueSignDay;
    @ApiModelProperty(value = "连续签到赠送数量", name = "continueSignPoint")
    private Integer continueSignPoint;
    @ApiModelProperty(value = "每消费多少元获取1个点", name = "consumePerPoint")
    private BigDecimal consumePerPoint;
    @ApiModelProperty(value = "最低获取点数的订单金额", name = "lowOrderAmount")
    private BigDecimal lowOrderAmount;
    @ApiModelProperty(value = "每笔订单最高获取点数", name = "maxPointPerOrder")
    private Integer maxPointPerOrder;
    @ApiModelProperty(value = "类型：0->积分规则；1->成长值规则", name = "type")
    private Integer type;

}
