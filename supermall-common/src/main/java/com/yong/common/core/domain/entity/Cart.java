package com.yong.common.core.domain.entity;


import com.yong.common.core.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cart extends BaseEntity {
    /**
     * 主键自增id
     */
    private int	id;
    /**
     * 用户id
     */
    private int	user_id;
    /**
     * 商品id
     */
    private int	goods_id;
    /**
     * 商品数量
     */
    private int	num;
    /**
     * 是否选中
     */
    private int	is_checked;
}
