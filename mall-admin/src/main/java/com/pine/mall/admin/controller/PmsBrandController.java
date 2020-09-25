package com.pine.mall.admin.controller;


import com.pine.common.api.CommonPage;
import com.pine.common.api.CommonResult;
import com.pine.mall.admin.dto.PmsBrandParam;
import com.pine.mall.admin.service.PmsBrandService;
import com.pine.mall.core.pms.entity.PmsBrand;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 品牌表
 *
 * @author Pine
 * @email 771190883@qq.com
 * @date 2020-09-25 22:27:58
 */
@Api(value = "品牌表接口", tags = {"品牌表接口"})
@RestController
@RequestMapping("ums/PmsBrand")
public class PmsBrandController {

    @Autowired
    private PmsBrandService pmsBrandService;

    /**
     * <p>获取全部记录。</p>
     */
    @ApiOperation(value = "获取所有品牌表数据", notes = "可以根据条件获取")
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public CommonResult<List<PmsBrand>> all(PmsBrand record) {
        List<PmsBrand> PmsBrandList = pmsBrandService.getPmsBrandList(record);
        return CommonResult.success(PmsBrandList);
    }

    /**
     * <p>根据Id。</p>
     */
    @ApiOperation(value = "获取品牌表数据", notes = "根据id来获取品牌表详细信息")
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public CommonResult getPmsBrand(@PathVariable("id") Long id) {
        PmsBrand data = pmsBrandService.getPmsBrandById(id);
        return CommonResult.success(data);
    }

    /**
     * <p>根据条件获取。</p>
     */
    @ApiOperation(value = "获取品牌表数据", notes = "根据条件获取")
    @RequestMapping(value = "/getOne", method = RequestMethod.GET)
    public CommonResult getOne(PmsBrand record) {

        PmsBrand data = pmsBrandService.getPmsBrand(record);

        return CommonResult.success(data);
    }

    /**
     * <p>分页查询。</p>
     */
    @ApiOperation(value = "分页获取品牌表数据", notes = "根据条件获取")
    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public CommonResult<CommonPage<PmsBrand>> page(PmsBrandParam record,
                                                   @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                   @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<PmsBrand> PmsBrandList = pmsBrandService.getPmsBrandByPage(record, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(PmsBrandList));
    }

    /**
     * <p>保存。</p>
     */
    @ApiOperation(value = "新增一条品牌表数据", notes = "新增一条品牌表数据")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public CommonResult create(@RequestBody PmsBrand record) {

        int count = pmsBrandService.createPmsBrand(record);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    /**
     * <p>更新信息。</p>
     */
    @ApiOperation(value = "更新一条品牌表数据", notes = "更新一条品牌表数据")
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public CommonResult updatePmsBrand(@RequestBody PmsBrand record) {

        int count = pmsBrandService.updatePmsBrand(record);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    /**
     * <p>删除。</p>
     */
    @RequestMapping(value = "/del/{id}", method = RequestMethod.DELETE)
    @ApiOperation(value = "删除一条品牌表数据", notes = "根据Id一条品牌表数据")
    public CommonResult deletePmsBrand(@PathVariable("id") Long id) {

        int count = pmsBrandService.delete(id);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

}
