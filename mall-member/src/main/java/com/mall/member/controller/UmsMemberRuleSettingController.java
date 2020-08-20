package com.mall.member.controller;

import java.util.List;
import com.mall.common.api.CommonPage;
import com.mall.common.api.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.mall.core.ums.entity.UmsMemberRuleSetting;
import com.mall.member.service.UmsMemberRuleSettingService;

/**
 * 会员积分成长规则表
 *
 * @author Pine
 * @email 771190883@qq.com
 * @date 2020-08-20 15:05:28
 */
@Api(value = "会员积分成长规则表接口", tags = {"会员积分成长规则表接口" })
@RestController
@RequestMapping("ums/UmsMemberRuleSetting")
public class UmsMemberRuleSettingController {

    @Autowired
    private UmsMemberRuleSettingService umsMemberRuleSettingService;

    /**
     * <p>获取全部记录。</p>
     */
    @ApiOperation(value = "获取所有会员积分成长规则表数据", notes = "可以根据条件获取")
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public CommonResult<List<UmsMemberRuleSetting>> all(UmsMemberRuleSetting record) {
        List<UmsMemberRuleSetting> UmsMemberRuleSettingList = umsMemberRuleSettingService.getUmsMemberRuleSettingList(record);
        return CommonResult.success(UmsMemberRuleSettingList);
    }

    /**
     * <p>根据Id。</p>
     */
    @ApiOperation(value = "获取会员积分成长规则表数据", notes = "根据id来获取会员积分成长规则表详细信息")
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public CommonResult getUmsMemberRuleSetting(@PathVariable("id") Long id) {
        UmsMemberRuleSetting data = umsMemberRuleSettingService.getUmsMemberRuleSettingById(id);
        return CommonResult.success(data);
    }

    /**
     * <p>根据条件获取。</p>
     */
    @ApiOperation(value = "获取会员积分成长规则表数据", notes = "根据条件获取")
    @RequestMapping(value = "/getOne", method = RequestMethod.GET)
    public CommonResult getOne(UmsMemberRuleSetting record) {

        UmsMemberRuleSetting data = umsMemberRuleSettingService.getUmsMemberRuleSetting(record);

        return CommonResult.success(data);
    }

    /**
     * <p>分页查询。</p>
     */
    @ApiOperation(value = "分页获取会员积分成长规则表数据", notes = "根据条件获取")
    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public CommonResult<CommonPage<UmsMemberRuleSetting>> page(UmsMemberRuleSetting record,
                                                                    @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                                    @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<UmsMemberRuleSetting> UmsMemberRuleSettingList = umsMemberRuleSettingService.getUmsMemberRuleSettingList(record);
        return CommonResult.success(CommonPage.restPage(UmsMemberRuleSettingList));
    }

    /**
     * <p>保存。</p>
     */
    @ApiOperation(value = "新增一条会员积分成长规则表数据", notes = "新增一条会员积分成长规则表数据")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public CommonResult create(@RequestBody UmsMemberRuleSetting record) {

        int count = umsMemberRuleSettingService.createUmsMemberRuleSetting(record);
        if (count > 0 ) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    /**
     * <p>更新信息。</p>
     */
    @ApiOperation(value = "更新一条会员积分成长规则表数据", notes = "更新一条会员积分成长规则表数据")
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public CommonResult updateUmsMemberRuleSetting(@RequestBody UmsMemberRuleSetting record) {

        int count = umsMemberRuleSettingService.updateUmsMemberRuleSetting(record);
        if (count > 0 ) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    /**
     * <p>删除。</p>
     */
    @RequestMapping(value = "/del/{id}", method = RequestMethod.DELETE)
    @ApiOperation(value = "删除一条会员积分成长规则表数据", notes = "根据Id一条会员积分成长规则表数据")
    public CommonResult deleteUmsMemberRuleSetting(@PathVariable("id") Long id) {

        int count = umsMemberRuleSettingService.delete(id);
        if (count > 0 ) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

}
