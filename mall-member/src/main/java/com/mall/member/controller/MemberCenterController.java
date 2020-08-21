package com.mall.member.controller;

import com.mall.common.api.CommonResult;
import com.mall.common.api.TokenInfo;
import com.mall.common.exception.BusinessException;
import com.mall.member.service.UmsMemberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

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
