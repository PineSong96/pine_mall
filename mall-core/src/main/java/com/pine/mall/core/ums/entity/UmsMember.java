package com.pine.mall.core.ums.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * 会员表
 *
 * @author Pine
 * @motto My code , I understand
 * @email 771190883@qq.com
 * @date 2020-08-12 15:26:00
 */
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@ApiModel(value = "会员表", description = "会员表")
public class UmsMember implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "", name = "id")
    private Long id;
    @ApiModelProperty(value = "", name = "memberLevelId")
    private Long memberLevelId;
    @ApiModelProperty(value = "用户名", name = "username")
    private String username;
    @ApiModelProperty(value = "密码", name = "password")
    private String password;
    @ApiModelProperty(value = "昵称", name = "nickname")
    private String nickname;
    @ApiModelProperty(value = "手机号码", name = "phone")
    private String phone;
    @ApiModelProperty(value = "帐号启用状态:0->禁用；1->启用", name = "status")
    private Integer status;
    @ApiModelProperty(value = "注册时间", name = "createTime")
    private Date createTime;
    @ApiModelProperty(value = "头像", name = "icon")
    private String icon;
    @ApiModelProperty(value = "性别：0->未知；1->男；2->女", name = "gender")
    private Integer gender;
    @ApiModelProperty(value = "生日", name = "birthday")
    private Date birthday;
    @ApiModelProperty(value = "所做城市", name = "city")
    private String city;
    @ApiModelProperty(value = "职业", name = "job")
    private String job;
    @ApiModelProperty(value = "个性签名", name = "personalizedSignature")
    private String personalizedSignature;
    @ApiModelProperty(value = "用户来源", name = "sourceType")
    private Integer sourceType;
    @ApiModelProperty(value = "积分", name = "integration")
    private Integer integration;
    @ApiModelProperty(value = "成长值", name = "growth")
    private Integer growth;
    @ApiModelProperty(value = "剩余抽奖次数", name = "luckeyCount")
    private Integer luckeyCount;
    @ApiModelProperty(value = "历史积分数量", name = "historyIntegration")
    private Integer historyIntegration;

}
