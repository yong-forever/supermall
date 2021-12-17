package com.yong.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yong.common.core.domain.entity.Slides;
import com.yong.system.mapper.SlidesMapper;
import com.yong.system.service.ISlidesService;
import org.springframework.stereotype.Service;

@Service
public class SlidesServiceImpl extends ServiceImpl<SlidesMapper, Slides> implements ISlidesService{
}
