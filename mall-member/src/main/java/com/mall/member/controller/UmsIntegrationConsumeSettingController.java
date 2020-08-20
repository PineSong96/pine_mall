package com.mall.member.controller;

import java.util.List;
import com.mall.common.api.CommonPage;
import com.mall.common.api.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.mall.core.ums.entity.UmsIntegrationConsumeSetting;
import com.mall.member.service.UmsIntegrationConsumeSettingService;

/**
 * 积分消费设置
 *
 * @author Pine
 * @email 771190883@qq.com
 * @date 2020-08-20 15:05:28
 */
@Api(value = "积分消费设置接口", tags = {"积分消费设置接口" })
@RestController
@RequestMapping("ums/UmsIntegrationConsumeSetting")
public class UmsIntegrationConsumeSettingController {

    @Autowired
    private UmsIntegrationConsumeSettingService umsIntegrationConsumeSettingService;

    /**
     * <p>获取全部记录。</p>
     */
    @ApiOperation(value = "获取所有积分消费设置数据", notes = "可以根据条件获取")
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public CommonResult<List<UmsIntegrationConsumeSetting>> all(UmsIntegrationConsumeSetting record) {
        List<UmsIntegrationConsumeSetting> UmsIntegrationConsumeSettingList = umsIntegrationConsumeSettingService.getUmsIntegrationConsumeSettingList(record);
        return CommonResult.success(UmsIntegrationConsumeSettingList);
    }

    /**
     * <p>根据Id。</p>
     */
    @ApiOperation(value = "获取积分消费设置数据", notes = "根据id来获取积分消费设置详细信息")
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public CommonResult getUmsIntegrationConsumeSetting(@PathVariable("id") Long id) {
        UmsIntegrationConsumeSetting data = umsIntegrationConsumeSettingService.getUmsIntegrationConsumeSettingById(id);
        return CommonResult.success(data);
    }

    /**
     * <p>根据条件获取。</p>
     */
    @ApiOperation(value = "获取积分消费设置数据", notes = "根据条件获取")
    @RequestMapping(value = "/getOne", method = RequestMethod.GET)
    public CommonResult getOne(UmsIntegrationConsumeSetting record) {

        UmsIntegrationConsumeSetting data = umsIntegrationConsumeSettingService.getUmsIntegrationConsumeSetting(record);

        return CommonResult.success(data);
    }

    /**
     * <p>分页查询。</p>
     */
    @ApiOperation(value = "分页获取积分消费设置数据", notes = "根据条件获取")
    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public CommonResult<CommonPage<UmsIntegrationConsumeSetting>> page(UmsIntegrationConsumeSetting record,
                                                                    @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                                    @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<UmsIntegrationConsumeSetting> UmsIntegrationConsumeSettingList = umsIntegrationConsumeSettingService.getUmsIntegrationConsumeSettingList(record);
        return CommonResult.success(CommonPage.restPage(UmsIntegrationConsumeSettingList));
    }

    /**
     * <p>保存。</p>
     */
    @ApiOperation(value = "新增一条积分消费设置数据", notes = "新增一条积分消费设置数据")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public CommonResult create(@RequestBody UmsIntegrationConsumeSetting record) {

        int count = umsIntegrationConsumeSettingService.createUmsIntegrationConsumeSetting(record);
        if (count > 0 ) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    /**
     * <p>更新信息。</p>
     */
    @ApiOperation(value = "更新一条积分消费设置数据", notes = "更新一条积分消费设置数据")
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public CommonResult updateUmsIntegrationConsumeSetting(@RequestBody UmsIntegrationConsumeSetting record) {

        int count = umsIntegrationConsumeSettingService.updateUmsIntegrationConsumeSetting(record);
        if (count > 0 ) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    /**
     * <p>删除。</p>
     */
    @RequestMapping(value = "/del/{id}", method = RequestMethod.DELETE)
    @ApiOperation(value = "删除一条积分消费设置数据", notes = "根据Id一条积分消费设置数据")
    public CommonResult deleteUmsIntegrationConsumeSetting(@PathVariable("id") Long id) {

        int count = umsIntegrationConsumeSettingService.delete(id);
        if (count > 0 ) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

}
