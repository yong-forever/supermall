package com.yong.common.core.domain.vo;


import com.yong.common.core.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GoodsVo extends BaseEntity {
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
     * 销售类型0综合1新款2流行
     */
    private int	sale_type;
    /**
     * 商品参数
     */
    private String	parameters;
    /**
     * 预览图集
     */
    private String	cover;
    /**
     * 展示图集
     */
    private String	pics;
    /**
     * 库存
     */
    private int	stock;
}
