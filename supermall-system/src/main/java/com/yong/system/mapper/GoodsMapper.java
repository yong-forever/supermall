package com.yong.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yong.common.core.domain.entity.Goods;
import com.yong.common.core.domain.vo.GoodsVo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface GoodsMapper extends BaseMapper<Goods> {

    @Select("SELECT\n" +
            "\tgoods.id,\n" +
            "\tgoods.type,\n" +
            "\tgoods.title,\n" +
            "\tgoods.img,\n" +
            "\tgoods.price,\n" +
            "\tgoods.sales,\n" +
            "\tgoods.sale_type,\n" +
            "\tgoods_detail.stock,\n" +
            "\tgoods_detail.cover,\n" +
            "\tgoods_detail.pics,\n" +
            "\tgoods_detail.parameters,\n" +
            "\tgoods.created_time,\n" +
            "\tgoods.updated_time \n" +
            "FROM\n" +
            "\tgoods\n" +
            "\tLEFT JOIN goods_detail ON goods.id = goods_detail.goods_id \n" +
            "WHERE\n" +
            "\tgoods.id = #{id}")
    GoodsVo getGoodById(@Param("id") int id);
}
