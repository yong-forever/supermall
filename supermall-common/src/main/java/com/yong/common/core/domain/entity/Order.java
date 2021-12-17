package com.yong.common.core.domain.entity;

import com.yong.common.core.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order extends BaseEntity {
    /**
     * 自增主键id
     */
    private int	id;
    /**
     * 用户id
     */
    private int	user_id;
    /**
     * 单号
     */
    private String	order_no;
    /**
     * 总金额
     */
    private int	amount;
    /**
     * 收获地址
     */
    private int	address_id;
    /**
     * 订单状态：1下单2支付3发货4收货5过期
     */
    private int	status;
    /**
     * 快递类型 SF YTO YD
     */
    private String	express_type;
    /**
     * 快递单号
     */
    private String	express_no;
    /**
     * 支付时间
     */
    private Date pay_time;

}
