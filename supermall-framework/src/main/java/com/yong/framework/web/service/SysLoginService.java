package com.yong.framework.web.service;

import com.yong.common.core.domain.model.LoginUser;
import com.yong.common.core.redis.RedisCache;
import com.yong.common.utils.DateUtils;
import com.yong.common.utils.ServletUtils;
import com.yong.common.utils.ip.IpUtils;
import com.yong.system.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.HashMap;

/**
 * 登录校验方法
 *
 * @author ruoyi
 */
@Component
public class SysLoginService {
    @Autowired
    private TokenService tokenService;

    @Resource
    private AuthenticationManager authenticationManager;

    @Autowired
    private RedisCache redisCache;

    @Autowired
    private IUserService userService;

    /**
     * 登录验证
     *
     * @param username 用户名
     * @param password 密码
     * @return 结果
     */
    public String login(String username, String password) {

        // 用户验证
        Authentication authentication = null;
        try {
            // 该方法会去调用UserDetailsServiceImpl.loadUserByUsername
            authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        LoginUser loginUser = (LoginUser) authentication.getPrincipal();
        recordLoginInfo(loginUser.getUserId());
        // 生成token
        return tokenService.createToken(loginUser);
    }

    /**
     * 记录登录信息
     *
     * @param userId 用户ID
     */
    public void recordLoginInfo(int userId) {
        HashMap userProfile = new HashMap();
        userProfile.put("userId", userId);
        userProfile.put("loginIp", IpUtils.getIpAddr(ServletUtils.getRequest()));
        userProfile.put("loginDate", DateUtils.getNowDate());
        redisCache.setCacheMap("userId", userProfile);
//        User sysUser = new User();
//        sysUser.setId(userId);
//        sysUser.setLoginIp(IpUtils.getIpAddr(ServletUtils.getRequest()));
//        sysUser.setLoginDate(DateUtils.getNowDate());
//        userService.updateUserProfile(sysUser);
    }
}
