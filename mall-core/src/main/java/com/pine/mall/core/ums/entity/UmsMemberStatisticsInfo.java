package com.pine.mall.core.ums.entity;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * 会员统计信息
 *
 * @author Pine
 * @motto My code , I understand
 * @email 771190883@qq.com
 * @date 2020-08-20 15:03:26
 */
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@ApiModel(value = "会员统计信息", description = "会员统计信息")
public class UmsMemberStatisticsInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "", name = "id")
    private Long id;
    @ApiModelProperty(value = "", name = "memberId")
    private Long memberId;
    @ApiModelProperty(value = "累计消费金额", name = "consumeAmount")
    private BigDecimal consumeAmount;
    @ApiModelProperty(value = "订单数量", name = "orderCount")
    private Integer orderCount;
    @ApiModelProperty(value = "优惠券数量", name = "couponCount")
    private Integer couponCount;
    @ApiModelProperty(value = "评价数", name = "commentCount")
    private Integer commentCount;
    @ApiModelProperty(value = "退货数量", name = "returnOrderCount")
    private Integer returnOrderCount;
    @ApiModelProperty(value = "登录次数", name = "loginCount")
    private Integer loginCount;
    @ApiModelProperty(value = "关注数量", name = "attendCount")
    private Integer attendCount;
    @ApiModelProperty(value = "粉丝数量", name = "fansCount")
    private Integer fansCount;
    @ApiModelProperty(value = "", name = "collectProductCount")
    private Integer collectProductCount;
    @ApiModelProperty(value = "", name = "collectSubjectCount")
    private Integer collectSubjectCount;
    @ApiModelProperty(value = "", name = "collectTopicCount")
    private Integer collectTopicCount;
    @ApiModelProperty(value = "", name = "collectCommentCount")
    private Integer collectCommentCount;
    @ApiModelProperty(value = "", name = "inviteFriendCount")
    private Integer inviteFriendCount;
    @ApiModelProperty(value = "最后一次下订单时间", name = "recentOrderTime")
    private Date recentOrderTime;

}
