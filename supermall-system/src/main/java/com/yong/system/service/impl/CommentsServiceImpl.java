package com.yong.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yong.common.core.domain.entity.Comments;
import com.yong.common.core.domain.entity.User;
import com.yong.system.mapper.CommentsMapper;
import com.yong.system.mapper.UserMapper;
import com.yong.system.service.ICommentsService;
import com.yong.system.service.IUserService;
import org.springframework.stereotype.Service;

@Service
public class CommentsServiceImpl extends ServiceImpl<CommentsMapper, Comments> implements ICommentsService {
}
