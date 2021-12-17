package com.yong.common.core.domain.entity;

import com.yong.common.core.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetail extends BaseEntity {
    /**
     * 用户id
     */
    private int	id;
    /**
     * 所属订单
     */
    private int	order_id;
    /**
     * 商品id
     */
    private int	goods_id;
    /**
     * 商品价格
     */
    private double	price;
    /**
     * 商品数量
     */
    private int	num;
}
