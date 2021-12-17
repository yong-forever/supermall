package com.yong.common.core.domain.entity;


import com.yong.common.core.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User extends BaseEntity {
    /**
     * 用户id
     */
    private int	id;
    /**
     * 用户昵称
     */
    private String	name;
    /**
     * 邮箱
     */
    private String	email;
    /**
     * 密码
     */
    private String	password;
    /**
     * 手机号
     */
    private String	phone;
    /**
     * 头像地址
     */
    private String	avatar;
    /**
     * 性别
     */
    private int gender;
    /**
     * 是否禁用
     */
    private int	is_locked;
    /**
     * 角色类型 0管理员 1普通用户
     */
    private int	role_type;
    /**
     * 邮箱认证时间
     */
    private Date password_verified;
    /**
     * 记住token
     */
    private String	remember_token;


}
