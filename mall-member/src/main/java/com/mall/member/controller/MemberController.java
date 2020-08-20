package com.mall.member.controller;

import java.util.List;

import com.mall.common.api.CommonPage;
import com.mall.common.api.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.mall.core.ums.entity.UmsMember;
import com.mall.member.service.UmsMemberService;

/**
 * 会员表
 *
 * @author Pine
 * @email 771190883@qq.com
 * @date 2020-08-19 17:51:03
 */
@Api(value = "会员表接口", tags = {"会员表接口" })
@RestController
@RequestMapping("ums/UmsMember")
public class MemberController {

    @Autowired
    private UmsMemberService umsMemberService;

    /**
     * <p>获取全部记录。</p>
     */
    @ApiOperation(value = "获取所有会员表数据", notes = "可以根据条件获取")
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public CommonResult<List<UmsMember>> all(UmsMember record) {
        List<UmsMember> UmsMemberList = umsMemberService.getUmsMemberList(record);
        return CommonResult.success(UmsMemberList);
    }

    /**
     * <p>根据Id。</p>
     */
    @ApiOperation(value = "获取会员表数据", notes = "根据id来获取会员表详细信息")
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public CommonResult getUmsMember(@PathVariable("id") Long id) {
        UmsMember data = umsMemberService.getUmsMemberById(id);
        return CommonResult.success(data);
    }

    /**
     * <p>根据条件获取。</p>
     */
    @ApiOperation(value = "获取会员表数据", notes = "根据条件获取")
    @RequestMapping(value = "/getOne", method = RequestMethod.GET)
    public CommonResult getOne(UmsMember record) {

        UmsMember data = umsMemberService.getUmsMember(record);

        return CommonResult.success(data);
    }

    /**
     * <p>分页查询。</p>
     */
    @ApiOperation(value = "分页获取会员表数据", notes = "根据条件获取")
    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public CommonResult<CommonPage<UmsMember>> page(UmsMember record,
                                                    @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                    @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<UmsMember> UmsMemberList = umsMemberService.getUmsMemberByPage(record, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(UmsMemberList));
    }

    /**
     * <p>保存。</p>
     */
    @ApiOperation(value = "新增一条会员表数据", notes = "新增一条会员表数据")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public CommonResult create(@RequestBody UmsMember record) {

        int count = umsMemberService.createUmsMember(record);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    /**
     * <p>更新信息。</p>
     */
    @ApiOperation(value = "更新一条会员表数据", notes = "更新一条会员表数据")
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public CommonResult updateUmsMember(@RequestBody UmsMember record) {

        int count = umsMemberService.updateUmsMember(record);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    /**
     * <p>删除。</p>
     */
    @RequestMapping(value = "/del/{id}", method = RequestMethod.DELETE)
    @ApiOperation(value = "删除一条会员表数据", notes = "根据Id一条会员表数据")
    public CommonResult deleteUmsMember(@PathVariable("id") Long id) {

        int count = umsMemberService.delete(id);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

}
