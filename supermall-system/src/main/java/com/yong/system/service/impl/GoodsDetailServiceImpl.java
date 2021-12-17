package com.yong.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yong.common.core.domain.entity.GoodsDetail;
import com.yong.common.core.domain.entity.User;
import com.yong.system.mapper.GoodsDetailMapper;
import com.yong.system.mapper.UserMapper;
import com.yong.system.service.IGoodsDetailService;
import com.yong.system.service.IUserService;
import org.springframework.stereotype.Service;

@Service
public class GoodsDetailServiceImpl extends ServiceImpl<GoodsDetailMapper, GoodsDetail> implements IGoodsDetailService {
}
