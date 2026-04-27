package com.vermouth.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.vermouth.entity.Blog;
import com.vermouth.mapper.BlogMapper;
import com.vermouth.service.IBlogService;
import org.springframework.stereotype.Service;

/**
 *  服务实现类
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements IBlogService {

}
