package com.yong.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yong.common.core.domain.entity.Order;
import com.yong.common.core.domain.entity.User;
import com.yong.system.mapper.OrderMapper;
import com.yong.system.mapper.UserMapper;
import com.yong.system.service.IOrderService;
import com.yong.system.service.IUserService;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements IOrderService {
}
