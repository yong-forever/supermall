package com.yong.framework.web.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yong.common.core.domain.entity.User;
import com.yong.common.core.domain.model.LoginUser;
import com.yong.common.enums.UserStatus;
import com.yong.common.utils.StringUtils;
import com.yong.system.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * 用户验证处理
 *
 * @author ruoyi
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService
{
    private static final Logger log = LoggerFactory.getLogger(UserDetailsServiceImpl.class);

    @Autowired
    private IUserService userService;

//    @Autowired
//    private SysPermissionService permissionService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
    {
        QueryWrapper queryWrapper=new QueryWrapper();
        queryWrapper.eq("email",username);
        User user = userService.getOne(queryWrapper);
        if (StringUtils.isNull(user))
        {
            log.info("登录用户：{} 不存在.", username);
            throw new RuntimeException("登录用户：" + username + " 不存在");
        }
        else if (UserStatus.DISABLE.getCode().equals(user.getIs_locked()))
        {
            log.info("登录用户：{} 已被停用.", username);
            throw new RuntimeException("对不起，您的账号：" + username + " 已停用");
        }

        return createLoginUser(user);
    }

    public UserDetails createLoginUser(User user)
    {
        return new LoginUser(user.getId(), user);
    }
}
