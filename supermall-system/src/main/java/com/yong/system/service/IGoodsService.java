package com.yong.system.service;

import com.baomidou.mybatisplus.annotation.SqlParser;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yong.common.core.domain.entity.Goods;
import com.yong.common.core.domain.vo.GoodsVo;


public interface IGoodsService extends IService<Goods> {


    GoodsVo getGoodById(int id);

    //IPage<Goods> selectGoodsVo(Page<?> page, Integer state);


}
