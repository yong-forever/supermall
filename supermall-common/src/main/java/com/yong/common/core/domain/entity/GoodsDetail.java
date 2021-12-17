package com.yong.common.core.domain.entity;


import com.yong.common.core.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GoodsDetail extends BaseEntity {
    /**
     * 自增主键id
     */
    private int	id;
    /**
     * 商品id
     */
    private int	goods_id;
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
