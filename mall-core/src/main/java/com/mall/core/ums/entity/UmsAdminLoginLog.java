package com.mall.core.ums.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * 后台用户登录日志表
 *
 * @author Pine
 * @motto My code , I understand
 * @email 771190883@qq.com
 * @date 2020-08-20 15:03:26
 */
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@ApiModel(value = "后台用户登录日志表", description = "后台用户登录日志表")
public class UmsAdminLoginLog implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "", name = "id")
    private Long id;
    @ApiModelProperty(value = "", name = "adminId")
    private Long adminId;
    @ApiModelProperty(value = "", name = "createTime")
    private Date createTime;
    @ApiModelProperty(value = "", name = "ip")
    private String ip;
    @ApiModelProperty(value = "", name = "address")
    private String address;
    @ApiModelProperty(value = "浏览器登录类型", name = "userAgent")
    private String userAgent;

}
