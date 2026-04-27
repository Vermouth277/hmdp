package com.vermouth.interceptor;

import com.vermouth.entity.User;
import com.vermouth.utils.UserHolder;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.servlet.HandlerInterceptor;

/**
 * 用户登陆拦截器
 */
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
       if(UserHolder.getUser() == null){
           response.setStatus(401);
           return false;
       }
        return true;
    }
}
