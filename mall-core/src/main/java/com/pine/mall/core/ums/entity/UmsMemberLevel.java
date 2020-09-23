package com.pine.mall.core.ums.entity;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * 会员等级表
 *
 * @author Pine
 * @motto My code , I understand
 * @email 771190883@qq.com
 * @date 2020-08-20 15:03:25
 */
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@ApiModel(value = "会员等级表", description = "会员等级表")
public class UmsMemberLevel implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "", name = "id")
    private Long id;
    @ApiModelProperty(value = "", name = "name")
    private String name;
    @ApiModelProperty(value = "", name = "growthPoint")
    private Integer growthPoint;
    @ApiModelProperty(value = "是否为默认等级：0->不是；1->是", name = "defaultStatus")
    private Integer defaultStatus;
    @ApiModelProperty(value = "免运费标准", name = "freeFreightPoint")
    private BigDecimal freeFreightPoint;
    @ApiModelProperty(value = "每次评价获取的成长值", name = "commentGrowthPoint")
    private Integer commentGrowthPoint;
    @ApiModelProperty(value = "是否有免邮特权", name = "priviledgeFreeFreight")
    private Integer priviledgeFreeFreight;
    @ApiModelProperty(value = "是否有签到特权", name = "priviledgeSignIn")
    private Integer priviledgeSignIn;
    @ApiModelProperty(value = "是否有评论获奖励特权", name = "priviledgeComment")
    private Integer priviledgeComment;
    @ApiModelProperty(value = "是否有专享活动特权", name = "priviledgePromotion")
    private Integer priviledgePromotion;
    @ApiModelProperty(value = "是否有会员价格特权", name = "priviledgeMemberPrice")
    private Integer priviledgeMemberPrice;
    @ApiModelProperty(value = "是否有生日特权", name = "priviledgeBirthday")
    private Integer priviledgeBirthday;
    @ApiModelProperty(value = "", name = "note")
    private String note;

}
