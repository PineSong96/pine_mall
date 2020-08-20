package com.mall.member.controller;

import java.util.List;
import com.mall.common.api.CommonPage;
import com.mall.common.api.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.mall.core.ums.entity.UmsGrowthChangeHistory;
import com.mall.member.service.UmsGrowthChangeHistoryService;

/**
 * 成长值变化历史记录表
 *
 * @author Pine
 * @email 771190883@qq.com
 * @date 2020-08-20 15:05:28
 */
@Api(value = "成长值变化历史记录表接口", tags = {"成长值变化历史记录表接口" })
@RestController
@RequestMapping("ums/UmsGrowthChangeHistory")
public class UmsGrowthChangeHistoryController {

    @Autowired
    private UmsGrowthChangeHistoryService umsGrowthChangeHistoryService;

    /**
     * <p>获取全部记录。</p>
     */
    @ApiOperation(value = "获取所有成长值变化历史记录表数据", notes = "可以根据条件获取")
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public CommonResult<List<UmsGrowthChangeHistory>> all(UmsGrowthChangeHistory record) {
        List<UmsGrowthChangeHistory> UmsGrowthChangeHistoryList = umsGrowthChangeHistoryService.getUmsGrowthChangeHistoryList(record);
        return CommonResult.success(UmsGrowthChangeHistoryList);
    }

    /**
     * <p>根据Id。</p>
     */
    @ApiOperation(value = "获取成长值变化历史记录表数据", notes = "根据id来获取成长值变化历史记录表详细信息")
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public CommonResult getUmsGrowthChangeHistory(@PathVariable("id") Long id) {
        UmsGrowthChangeHistory data = umsGrowthChangeHistoryService.getUmsGrowthChangeHistoryById(id);
        return CommonResult.success(data);
    }

    /**
     * <p>根据条件获取。</p>
     */
    @ApiOperation(value = "获取成长值变化历史记录表数据", notes = "根据条件获取")
    @RequestMapping(value = "/getOne", method = RequestMethod.GET)
    public CommonResult getOne(UmsGrowthChangeHistory record) {

        UmsGrowthChangeHistory data = umsGrowthChangeHistoryService.getUmsGrowthChangeHistory(record);

        return CommonResult.success(data);
    }

    /**
     * <p>分页查询。</p>
     */
    @ApiOperation(value = "分页获取成长值变化历史记录表数据", notes = "根据条件获取")
    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public CommonResult<CommonPage<UmsGrowthChangeHistory>> page(UmsGrowthChangeHistory record,
                                                                    @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                                    @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<UmsGrowthChangeHistory> UmsGrowthChangeHistoryList = umsGrowthChangeHistoryService.getUmsGrowthChangeHistoryList(record);
        return CommonResult.success(CommonPage.restPage(UmsGrowthChangeHistoryList));
    }

    /**
     * <p>保存。</p>
     */
    @ApiOperation(value = "新增一条成长值变化历史记录表数据", notes = "新增一条成长值变化历史记录表数据")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public CommonResult create(@RequestBody UmsGrowthChangeHistory record) {

        int count = umsGrowthChangeHistoryService.createUmsGrowthChangeHistory(record);
        if (count > 0 ) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    /**
     * <p>更新信息。</p>
     */
    @ApiOperation(value = "更新一条成长值变化历史记录表数据", notes = "更新一条成长值变化历史记录表数据")
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public CommonResult updateUmsGrowthChangeHistory(@RequestBody UmsGrowthChangeHistory record) {

        int count = umsGrowthChangeHistoryService.updateUmsGrowthChangeHistory(record);
        if (count > 0 ) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    /**
     * <p>删除。</p>
     */
    @RequestMapping(value = "/del/{id}", method = RequestMethod.DELETE)
    @ApiOperation(value = "删除一条成长值变化历史记录表数据", notes = "根据Id一条成长值变化历史记录表数据")
    public CommonResult deleteUmsGrowthChangeHistory(@PathVariable("id") Long id) {

        int count = umsGrowthChangeHistoryService.delete(id);
        if (count > 0 ) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

}
