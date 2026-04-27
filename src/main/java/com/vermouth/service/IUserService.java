package com.vermouth.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.vermouth.dto.LoginFormDTO;
import com.vermouth.dto.Result;
import com.vermouth.entity.User;
import jakarta.servlet.http.HttpSession;

/**
 *  服务类
 */
public interface IUserService extends IService<User> {
    Result sendCode(String phone);

    Result login(LoginFormDTO loginForm);
}
