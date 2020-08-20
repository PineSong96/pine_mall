package com.mall.member.controller;

import java.util.List;
import com.mall.common.api.CommonPage;
import com.mall.common.api.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.mall.core.ums.entity.UmsMemberLoginLog;
import com.mall.member.service.UmsMemberLoginLogService;

/**
 * 会员登录记录
 *
 * @author Pine
 * @email 771190883@qq.com
 * @date 2020-08-20 15:05:28
 */
@Api(value = "会员登录记录接口", tags = {"会员登录记录接口" })
@RestController
@RequestMapping("ums/UmsMemberLoginLog")
public class UmsMemberLoginLogController {

    @Autowired
    private UmsMemberLoginLogService umsMemberLoginLogService;

    /**
     * <p>获取全部记录。</p>
     */
    @ApiOperation(value = "获取所有会员登录记录数据", notes = "可以根据条件获取")
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public CommonResult<List<UmsMemberLoginLog>> all(UmsMemberLoginLog record) {
        List<UmsMemberLoginLog> UmsMemberLoginLogList = umsMemberLoginLogService.getUmsMemberLoginLogList(record);
        return CommonResult.success(UmsMemberLoginLogList);
    }

    /**
     * <p>根据Id。</p>
     */
    @ApiOperation(value = "获取会员登录记录数据", notes = "根据id来获取会员登录记录详细信息")
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public CommonResult getUmsMemberLoginLog(@PathVariable("id") Long id) {
        UmsMemberLoginLog data = umsMemberLoginLogService.getUmsMemberLoginLogById(id);
        return CommonResult.success(data);
    }

    /**
     * <p>根据条件获取。</p>
     */
    @ApiOperation(value = "获取会员登录记录数据", notes = "根据条件获取")
    @RequestMapping(value = "/getOne", method = RequestMethod.GET)
    public CommonResult getOne(UmsMemberLoginLog record) {

        UmsMemberLoginLog data = umsMemberLoginLogService.getUmsMemberLoginLog(record);

        return CommonResult.success(data);
    }

    /**
     * <p>分页查询。</p>
     */
    @ApiOperation(value = "分页获取会员登录记录数据", notes = "根据条件获取")
    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public CommonResult<CommonPage<UmsMemberLoginLog>> page(UmsMemberLoginLog record,
                                                                    @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                                    @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<UmsMemberLoginLog> UmsMemberLoginLogList = umsMemberLoginLogService.getUmsMemberLoginLogList(record);
        return CommonResult.success(CommonPage.restPage(UmsMemberLoginLogList));
    }

    /**
     * <p>保存。</p>
     */
    @ApiOperation(value = "新增一条会员登录记录数据", notes = "新增一条会员登录记录数据")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public CommonResult create(@RequestBody UmsMemberLoginLog record) {

        int count = umsMemberLoginLogService.createUmsMemberLoginLog(record);
        if (count > 0 ) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    /**
     * <p>更新信息。</p>
     */
    @ApiOperation(value = "更新一条会员登录记录数据", notes = "更新一条会员登录记录数据")
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public CommonResult updateUmsMemberLoginLog(@RequestBody UmsMemberLoginLog record) {

        int count = umsMemberLoginLogService.updateUmsMemberLoginLog(record);
        if (count > 0 ) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    /**
     * <p>删除。</p>
     */
    @RequestMapping(value = "/del/{id}", method = RequestMethod.DELETE)
    @ApiOperation(value = "删除一条会员登录记录数据", notes = "根据Id一条会员登录记录数据")
    public CommonResult deleteUmsMemberLoginLog(@PathVariable("id") Long id) {

        int count = umsMemberLoginLogService.delete(id);
        if (count > 0 ) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

}
