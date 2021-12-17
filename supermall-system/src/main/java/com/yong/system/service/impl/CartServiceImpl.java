package com.yong.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yong.common.core.domain.entity.Cart;
import com.yong.system.mapper.CartMapper;
import com.yong.system.service.ICartService;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl extends ServiceImpl<CartMapper, Cart> implements ICartService {
}
