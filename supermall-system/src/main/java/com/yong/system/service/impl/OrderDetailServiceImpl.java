package com.yong.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yong.common.core.domain.entity.OrderDetail;
import com.yong.system.mapper.OrderDetailMapper;
import com.yong.system.service.IOrderDetailService;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements IOrderDetailService{
}
