package com.mall.member.controller;

import java.util.List;
import com.mall.common.api.CommonPage;
import com.mall.common.api.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.mall.core.ums.entity.UmsIntegrationChangeHistory;
import com.mall.member.service.UmsIntegrationChangeHistoryService;

/**
 * 积分变化历史记录表
 *
 * @author Pine
 * @email 771190883@qq.com
 * @date 2020-08-20 15:05:28
 */
@Api(value = "积分变化历史记录表接口", tags = {"积分变化历史记录表接口" })
@RestController
@RequestMapping("ums/UmsIntegrationChangeHistory")
public class UmsIntegrationChangeHistoryController {

    @Autowired
    private UmsIntegrationChangeHistoryService umsIntegrationChangeHistoryService;

    /**
     * <p>获取全部记录。</p>
     */
    @ApiOperation(value = "获取所有积分变化历史记录表数据", notes = "可以根据条件获取")
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public CommonResult<List<UmsIntegrationChangeHistory>> all(UmsIntegrationChangeHistory record) {
        List<UmsIntegrationChangeHistory> UmsIntegrationChangeHistoryList = umsIntegrationChangeHistoryService.getUmsIntegrationChangeHistoryList(record);
        return CommonResult.success(UmsIntegrationChangeHistoryList);
    }

    /**
     * <p>根据Id。</p>
     */
    @ApiOperation(value = "获取积分变化历史记录表数据", notes = "根据id来获取积分变化历史记录表详细信息")
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public CommonResult getUmsIntegrationChangeHistory(@PathVariable("id") Long id) {
        UmsIntegrationChangeHistory data = umsIntegrationChangeHistoryService.getUmsIntegrationChangeHistoryById(id);
        return CommonResult.success(data);
    }

    /**
     * <p>根据条件获取。</p>
     */
    @ApiOperation(value = "获取积分变化历史记录表数据", notes = "根据条件获取")
    @RequestMapping(value = "/getOne", method = RequestMethod.GET)
    public CommonResult getOne(UmsIntegrationChangeHistory record) {

        UmsIntegrationChangeHistory data = umsIntegrationChangeHistoryService.getUmsIntegrationChangeHistory(record);

        return CommonResult.success(data);
    }

    /**
     * <p>分页查询。</p>
     */
    @ApiOperation(value = "分页获取积分变化历史记录表数据", notes = "根据条件获取")
    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public CommonResult<CommonPage<UmsIntegrationChangeHistory>> page(UmsIntegrationChangeHistory record,
                                                                    @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                                    @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<UmsIntegrationChangeHistory> UmsIntegrationChangeHistoryList = umsIntegrationChangeHistoryService.getUmsIntegrationChangeHistoryList(record);
        return CommonResult.success(CommonPage.restPage(UmsIntegrationChangeHistoryList));
    }

    /**
     * <p>保存。</p>
     */
    @ApiOperation(value = "新增一条积分变化历史记录表数据", notes = "新增一条积分变化历史记录表数据")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public CommonResult create(@RequestBody UmsIntegrationChangeHistory record) {

        int count = umsIntegrationChangeHistoryService.createUmsIntegrationChangeHistory(record);
        if (count > 0 ) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    /**
     * <p>更新信息。</p>
     */
    @ApiOperation(value = "更新一条积分变化历史记录表数据", notes = "更新一条积分变化历史记录表数据")
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public CommonResult updateUmsIntegrationChangeHistory(@RequestBody UmsIntegrationChangeHistory record) {

        int count = umsIntegrationChangeHistoryService.updateUmsIntegrationChangeHistory(record);
        if (count > 0 ) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    /**
     * <p>删除。</p>
     */
    @RequestMapping(value = "/del/{id}", method = RequestMethod.DELETE)
    @ApiOperation(value = "删除一条积分变化历史记录表数据", notes = "根据Id一条积分变化历史记录表数据")
    public CommonResult deleteUmsIntegrationChangeHistory(@PathVariable("id") Long id) {

        int count = umsIntegrationChangeHistoryService.delete(id);
        if (count > 0 ) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

}
