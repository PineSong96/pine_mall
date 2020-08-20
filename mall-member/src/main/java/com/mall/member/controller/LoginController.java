package com.mall.member.controller;

import com.mall.common.api.CommonResult;
import com.mall.common.api.TokenInfo;
import com.mall.member.service.UmsMemberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

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
@RequestMapping("/sso")
@Api(tags = "LoginController", description = "会员登录注册管理")
public class LoginController {
    @Autowired
    private UmsMemberService memberService;

    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @ApiOperation("会员登录")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult login(@RequestParam String username,
                              @RequestParam String password) {
        TokenInfo tokenInfo = memberService.login(username, password);
        if (tokenInfo == null) {
            return CommonResult.validateFailed("用户名或密码错误");
        }
        Map<String, String> tokenMap = new HashMap<>();
        tokenMap.put("token", tokenInfo.getAccess_token());
        tokenMap.put("tokenHead", tokenHead);
        tokenMap.put("refreshToken", tokenInfo.getRefresh_token());
        return CommonResult.success(tokenMap);
    }
}
