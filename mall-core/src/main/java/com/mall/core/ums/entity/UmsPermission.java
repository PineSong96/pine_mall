package com.mall.core.ums.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * 后台用户权限表
 *
 * @author Pine
 * @motto My code
 * @email 771190883@qq.com
 * @date 2020-08-20 15:03:26
 */
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@ApiModel(value = "后台用户权限表", description = "后台用户权限表")
public class UmsPermission implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "", name = "id")
    private Long id;
    @ApiModelProperty(value = "父级权限id", name = "pid")
    private Long pid;
    @ApiModelProperty(value = "名称", name = "name")
    private String name;
    @ApiModelProperty(value = "权限值", name = "value")
    private String value;
    @ApiModelProperty(value = "图标", name = "icon")
    private String icon;
    @ApiModelProperty(value = "权限类型：0->目录；1->菜单；2->按钮（接口绑定权限）", name = "type")
    private Integer type;
    @ApiModelProperty(value = "前端资源路径", name = "uri")
    private String uri;
    @ApiModelProperty(value = "启用状态；0->禁用；1->启用", name = "status")
    private Integer status;
    @ApiModelProperty(value = "创建时间", name = "createTime")
    private Date createTime;
    @ApiModelProperty(value = "排序", name = "sort")
    private Integer sort;

}
