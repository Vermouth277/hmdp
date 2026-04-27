package com.vermouth.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.vermouth.entity.Follow;
import com.vermouth.mapper.FollowMapper;
import com.vermouth.service.IFollowService;
import org.springframework.stereotype.Service;

/**
 *  服务实现类
 */
@Service
public class FollowServiceImpl extends ServiceImpl<FollowMapper, Follow> implements IFollowService {

}
