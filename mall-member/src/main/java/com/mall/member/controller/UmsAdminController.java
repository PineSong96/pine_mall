package com.mall.member.controller;

import java.util.List;
import com.mall.common.api.CommonPage;
import com.mall.common.api.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.mall.core.ums.entity.UmsAdmin;
import com.mall.member.service.UmsAdminService;

/**
 * 后台用户表
 *
 * @author Pine
 * @email 771190883@qq.com
 * @date 2020-08-20 15:05:28
 */
@Api(value = "后台用户表接口", tags = {"后台用户表接口" })
@RestController
@RequestMapping("ums/UmsAdmin")
public class UmsAdminController {

    @Autowired
    private UmsAdminService umsAdminService;

    /**
     * <p>获取全部记录。</p>
     */
    @ApiOperation(value = "获取所有后台用户表数据", notes = "可以根据条件获取")
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public CommonResult<List<UmsAdmin>> all(UmsAdmin record) {
        List<UmsAdmin> UmsAdminList = umsAdminService.getUmsAdminList(record);
        return CommonResult.success(UmsAdminList);
    }

    /**
     * <p>根据Id。</p>
     */
    @ApiOperation(value = "获取后台用户表数据", notes = "根据id来获取后台用户表详细信息")
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public CommonResult getUmsAdmin(@PathVariable("id") Long id) {
        UmsAdmin data = umsAdminService.getUmsAdminById(id);
        return CommonResult.success(data);
    }

    /**
     * <p>根据条件获取。</p>
     */
    @ApiOperation(value = "获取后台用户表数据", notes = "根据条件获取")
    @RequestMapping(value = "/getOne", method = RequestMethod.GET)
    public CommonResult getOne(UmsAdmin record) {

        UmsAdmin data = umsAdminService.getUmsAdmin(record);

        return CommonResult.success(data);
    }

    /**
     * <p>分页查询。</p>
     */
    @ApiOperation(value = "分页获取后台用户表数据", notes = "根据条件获取")
    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public CommonResult<CommonPage<UmsAdmin>> page(UmsAdmin record,
                                                                    @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                                    @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<UmsAdmin> UmsAdminList = umsAdminService.getUmsAdminList(record);
        return CommonResult.success(CommonPage.restPage(UmsAdminList));
    }

    /**
     * <p>保存。</p>
     */
    @ApiOperation(value = "新增一条后台用户表数据", notes = "新增一条后台用户表数据")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public CommonResult create(@RequestBody UmsAdmin record) {

        int count = umsAdminService.createUmsAdmin(record);
        if (count > 0 ) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    /**
     * <p>更新信息。</p>
     */
    @ApiOperation(value = "更新一条后台用户表数据", notes = "更新一条后台用户表数据")
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public CommonResult updateUmsAdmin(@RequestBody UmsAdmin record) {

        int count = umsAdminService.updateUmsAdmin(record);
        if (count > 0 ) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    /**
     * <p>删除。</p>
     */
    @RequestMapping(value = "/del/{id}", method = RequestMethod.DELETE)
    @ApiOperation(value = "删除一条后台用户表数据", notes = "根据Id一条后台用户表数据")
    public CommonResult deleteUmsAdmin(@PathVariable("id") Long id) {

        int count = umsAdminService.delete(id);
        if (count > 0 ) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

}
