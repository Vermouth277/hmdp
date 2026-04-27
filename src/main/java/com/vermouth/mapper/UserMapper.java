package com.vermouth.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.vermouth.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 *  Mapper 接口
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
