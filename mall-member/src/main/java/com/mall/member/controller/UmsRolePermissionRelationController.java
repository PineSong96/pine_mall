package com.mall.member.controller;

import java.util.List;
import com.mall.common.api.CommonPage;
import com.mall.common.api.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.mall.core.ums.entity.UmsRolePermissionRelation;
import com.mall.member.service.UmsRolePermissionRelationService;

/**
 * 后台用户角色和权限关系表
 *
 * @author Pine
 * @email 771190883@qq.com
 * @date 2020-08-20 15:05:28
 */
@Api(value = "后台用户角色和权限关系表接口", tags = {"后台用户角色和权限关系表接口" })
@RestController
@RequestMapping("ums/UmsRolePermissionRelation")
public class UmsRolePermissionRelationController {

    @Autowired
    private UmsRolePermissionRelationService umsRolePermissionRelationService;

    /**
     * <p>获取全部记录。</p>
     */
    @ApiOperation(value = "获取所有后台用户角色和权限关系表数据", notes = "可以根据条件获取")
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public CommonResult<List<UmsRolePermissionRelation>> all(UmsRolePermissionRelation record) {
        List<UmsRolePermissionRelation> UmsRolePermissionRelationList = umsRolePermissionRelationService.getUmsRolePermissionRelationList(record);
        return CommonResult.success(UmsRolePermissionRelationList);
    }

    /**
     * <p>根据Id。</p>
     */
    @ApiOperation(value = "获取后台用户角色和权限关系表数据", notes = "根据id来获取后台用户角色和权限关系表详细信息")
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public CommonResult getUmsRolePermissionRelation(@PathVariable("id") Long id) {
        UmsRolePermissionRelation data = umsRolePermissionRelationService.getUmsRolePermissionRelationById(id);
        return CommonResult.success(data);
    }

    /**
     * <p>根据条件获取。</p>
     */
    @ApiOperation(value = "获取后台用户角色和权限关系表数据", notes = "根据条件获取")
    @RequestMapping(value = "/getOne", method = RequestMethod.GET)
    public CommonResult getOne(UmsRolePermissionRelation record) {

        UmsRolePermissionRelation data = umsRolePermissionRelationService.getUmsRolePermissionRelation(record);

        return CommonResult.success(data);
    }

    /**
     * <p>分页查询。</p>
     */
    @ApiOperation(value = "分页获取后台用户角色和权限关系表数据", notes = "根据条件获取")
    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public CommonResult<CommonPage<UmsRolePermissionRelation>> page(UmsRolePermissionRelation record,
                                                                    @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                                    @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<UmsRolePermissionRelation> UmsRolePermissionRelationList = umsRolePermissionRelationService.getUmsRolePermissionRelationList(record);
        return CommonResult.success(CommonPage.restPage(UmsRolePermissionRelationList));
    }

    /**
     * <p>保存。</p>
     */
    @ApiOperation(value = "新增一条后台用户角色和权限关系表数据", notes = "新增一条后台用户角色和权限关系表数据")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public CommonResult create(@RequestBody UmsRolePermissionRelation record) {

        int count = umsRolePermissionRelationService.createUmsRolePermissionRelation(record);
        if (count > 0 ) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    /**
     * <p>更新信息。</p>
     */
    @ApiOperation(value = "更新一条后台用户角色和权限关系表数据", notes = "更新一条后台用户角色和权限关系表数据")
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public CommonResult updateUmsRolePermissionRelation(@RequestBody UmsRolePermissionRelation record) {

        int count = umsRolePermissionRelationService.updateUmsRolePermissionRelation(record);
        if (count > 0 ) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    /**
     * <p>删除。</p>
     */
    @RequestMapping(value = "/del/{id}", method = RequestMethod.DELETE)
    @ApiOperation(value = "删除一条后台用户角色和权限关系表数据", notes = "根据Id一条后台用户角色和权限关系表数据")
    public CommonResult deleteUmsRolePermissionRelation(@PathVariable("id") Long id) {

        int count = umsRolePermissionRelationService.delete(id);
        if (count > 0 ) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

}
