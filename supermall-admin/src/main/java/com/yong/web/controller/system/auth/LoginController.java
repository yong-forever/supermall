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

@Api(value = "auth",tags = "登录")
@RestController
@RequestMapping("/api/auth")
public class LoginController {

    @Autowired
    private SysLoginService loginService;


    @ApiOperation("/login")
    @PostMapping("/login")
    public AjaxResult login(@RequestBody LoginBody loginBody) {
        AjaxResult ajax = AjaxResult.success();
        // 生成令牌
        String token = loginService.login(loginBody.getUsername(), loginBody.getPassword());
        ajax.put(Constants.TOKEN, token);
        return ajax;
    }


    /**
     * 获取当前用户信息
     *
     * @return 用户信息
     */
    @ApiOperation("获取当前用户信息")
    @GetMapping("/getInfo")
    public AjaxResult getInfo() {
        User user = SecurityUtils.getLoginUser().getUser();
        // 角色集合
//        Set<String> roles = permissionService.getRolePermission(user);
//        // 权限集合
//        Set<String> permissions = permissionService.getMenuPermission(user);
        AjaxResult ajax = AjaxResult.success();
        ajax.put("user", user);
//        ajax.put("roles", roles);
//        ajax.put("permissions", permissions);
        return ajax;
    }
}
