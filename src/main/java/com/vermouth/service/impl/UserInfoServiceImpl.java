package com.vermouth.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.vermouth.entity.UserInfo;
import com.vermouth.mapper.UserInfoMapper;
import com.vermouth.service.IUserInfoService;
import org.springframework.stereotype.Service;

/**
 *  服务实现类
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements IUserInfoService {

}
