package com.vermouth.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.vermouth.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 *  Mapper 接口
 */
@Mapper
public interface UserInfoMapper extends BaseMapper<UserInfo> {

}
