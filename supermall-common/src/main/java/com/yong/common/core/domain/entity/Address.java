package com.yong.common.core.domain.entity;

import com.yong.common.core.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address extends BaseEntity {
    /**
     * 主键自增id
     */
    private int	id;
    /**
     * 用户id
     */
    private int	user_id;
    /**
     * 用户昵称
     */
    private String	name;
    /**
     * 省份
     */
    private String	province;
    /**
     * 城市
     */
    private String	city;
    /**
     * 区县
     */
    private String	county;
    /**
     * 详细地址
     */
    private String	address;
    /**
     * 手机号
     */
    private String	phone;
    /**
     * 是否默认地址
     */
    private int	is_default;

}
