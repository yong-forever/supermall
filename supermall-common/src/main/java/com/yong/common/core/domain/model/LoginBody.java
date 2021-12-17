package com.yong.common.core.domain.model;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "UserEntity", description = "用户实体")
public class LoginBody
{
    /**
     * 用户名
     */
    @ApiModelProperty("用户名(手机号或邮箱)")
    private String username;

    /**
     * 用户密码
     */
    @ApiModelProperty("用户名(用户密码)")
    private String password;

    /**
     * 唯一标识
     */
    @ApiModelProperty("唯一标识(自动生成)")
    private String uuid = "";

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getUuid()
    {
        return uuid;
    }

    public void setUuid(String uuid)
    {
        this.uuid = uuid;
    }
}
