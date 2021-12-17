package com.yong.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yong.common.core.domain.entity.Goods;
import com.yong.common.core.domain.entity.User;
import com.yong.common.core.domain.vo.GoodsVo;
import com.yong.system.mapper.GoodsMapper;
import com.yong.system.mapper.UserMapper;
import com.yong.system.service.IGoodsService;
import com.yong.system.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements IGoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public GoodsVo getGoodById(int id) {
        return goodsMapper.getGoodById(id);
    }
}
