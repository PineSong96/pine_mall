package com.mall.core.ums.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * 会员登录记录
 *
 * @author Pine
 * @motto My code , I understand
 * @email 771190883@qq.com
 * @date 2020-08-20 15:03:26
 */
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@ApiModel(value = "会员登录记录", description = "会员登录记录")
public class UmsMemberLoginLog implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "", name = "id")
    private Long id;
    @ApiModelProperty(value = "", name = "memberId")
    private Long memberId;
    @ApiModelProperty(value = "", name = "createTime")
    private Date createTime;
    @ApiModelProperty(value = "", name = "ip")
    private String ip;
    @ApiModelProperty(value = "", name = "city")
    private String city;
    @ApiModelProperty(value = "登录类型：0->PC；1->android;2->ios;3->小程序", name = "loginType")
    private Integer loginType;
    @ApiModelProperty(value = "", name = "province")
    private String province;

}
