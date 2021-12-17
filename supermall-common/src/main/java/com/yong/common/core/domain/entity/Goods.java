package com.yong.common.core.domain.entity;


import com.yong.common.core.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Goods extends BaseEntity {
    /**
     * 主键自增id
     */
    private int	id;
    /**
     * 商品类型0上衣1裤子2裙子3内衣4鞋子
     */
    private String	type;
    /**
     * 标题
     */
    private String	title;
    /**
     * 标题图片地址
     */
    private String	img;
    /**
     * 价格
     */
    private double	price;
    /**
     * 销量
     */
    private int	sales;
    /**
     * 销售类型 0下架 1综合 2新款 3流行
     */
    private int	sale_type;
}
