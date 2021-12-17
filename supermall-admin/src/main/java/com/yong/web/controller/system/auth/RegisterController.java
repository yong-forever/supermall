package com.yong.web.controller.system.auth;

import com.yong.common.constant.Constants;
import com.yong.common.core.domain.AjaxResult;
import com.yong.common.core.domain.entity.User;
import com.yong.common.core.domain.model.LoginBody;
import com.yong.common.utils.SecurityUtils;
import com.yong.framework.web.service.SysLoginService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(value = "auth",tags = "注册")
@RestController
@RequestMapping("/api/auth")
public class RegisterController {

    @Autowired
    private SysLoginService loginService;


    /**
     * 用户登录
     * @param loginBody
     * @return
     */
    @ApiOperation("用户登录")
    @PostMapping("/register")
    public AjaxResult login(@RequestBody LoginBody loginBody) {
        AjaxResult ajax = AjaxResult.success();
        // 生成令牌
        String token = loginService.login(loginBody.getUsername(), loginBody.getPassword());
        ajax.put(Constants.TOKEN, token);
        return ajax;
    }
}
