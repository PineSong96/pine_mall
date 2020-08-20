package com.mall.core.ums.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * 后台用户和角色关系表
 *
 * @author Pine
 * @motto My code
 * @email 771190883@qq.com
 * @date 2020-08-20 15:03:26
 */
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@ApiModel(value = "后台用户和角色关系表", description = "后台用户和角色关系表")
public class UmsAdminRoleRelation implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "", name = "id")
    private Long id;
    @ApiModelProperty(value = "", name = "adminId")
    private Long adminId;
    @ApiModelProperty(value = "", name = "roleId")
    private Long roleId;

}
