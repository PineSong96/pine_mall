package com.pine.mall.member.controller;

import com.pine.common.api.CommonResult;
import com.pine.mall.member.service.UmsMemberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @vlog: My code, I understand
 * @desc: 会员账号管理
 * @author: pine
 * @createDate: 2020/8/20
 * @version: 1.0
 */
@RestController
@RequestMapping("/member/center")
@Api(tags = "LoginController", description = "会员登录注册管理")
public class MemberCenterController {
    @Autowired
    private UmsMemberService memberService;

    @ApiOperation("获取用户信息")
    @PostMapping(value = "/getInfo")
    @ResponseBody
    public CommonResult getAuthCode(@RequestParam Long id) {
        return CommonResult.success(memberService.getUmsMemberById(id));
    }
}
