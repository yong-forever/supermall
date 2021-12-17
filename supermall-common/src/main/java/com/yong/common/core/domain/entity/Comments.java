package com.yong.common.core.domain.entity;


import com.yong.common.core.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comments extends BaseEntity{
    /**
     * 主键自增id
     */
    private int	id;
    /**
     * 用户id
     */
    private int	user_id;
    /**
     * 订单id
     */
    private int	order_id;
    /**
     * 商品id
     */
    private int	goods_id;
    /**
     * 评价内容
     */
    private String	content;
    /**
     * 评价星级
     */
    private int	star;
    /**
     * 评论时间
     */
    private Date time;
}
