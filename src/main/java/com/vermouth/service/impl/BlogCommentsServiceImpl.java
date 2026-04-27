package com.vermouth.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.vermouth.entity.BlogComments;
import com.vermouth.mapper.BlogCommentsMapper;
import com.vermouth.service.IBlogCommentsService;
import org.springframework.stereotype.Service;

/**
 *  服务实现类
 */
@Service
public class BlogCommentsServiceImpl extends ServiceImpl<BlogCommentsMapper, BlogComments> implements IBlogCommentsService {

}
