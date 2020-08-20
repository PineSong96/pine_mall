package com.mall.core.ums.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * 成长值变化历史记录表
 *
 * @author Pine
 * @motto My code , I understand
 * @email 771190883@qq.com
 * @date 2020-08-20 15:03:26
 */
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@ApiModel(value = "成长值变化历史记录表", description = "成长值变化历史记录表")
public class UmsGrowthChangeHistory implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "", name = "id")
    private Long id;
    @ApiModelProperty(value = "", name = "memberId")
    private Long memberId;
    @ApiModelProperty(value = "", name = "createTime")
    private Date createTime;
    @ApiModelProperty(value = "改变类型：0->增加；1->减少", name = "changeType")
    private Integer changeType;
    @ApiModelProperty(value = "积分改变数量", name = "changeCount")
    private Integer changeCount;
    @ApiModelProperty(value = "操作人员", name = "operateMan")
    private String operateMan;
    @ApiModelProperty(value = "操作备注", name = "operateNote")
    private String operateNote;
    @ApiModelProperty(value = "积分来源：0->购物；1->管理员修改", name = "sourceType")
    private Integer sourceType;

}
