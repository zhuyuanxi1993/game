package com.zyx.interceptor;


import com.alibaba.druid.util.StringUtils;
import com.zyx.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class LoginInterceptor extends HandlerInterceptorAdapter {

    @Autowired
    private LoginService loginService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Cookie[] cookies = request.getCookies();
        String username = null;
        String password = null;
        for(Cookie cookie : cookies){
            if("userName".equals(cookie.getName())){
                username = cookie.getValue();
            }
            if("password".equals(cookie.getName())){
                password = cookie.getValue();
            }
        }
        if(StringUtils.isEmpty(username) || StringUtils.isEmpty(password)){
            response.sendRedirect("/login");
            return false;
        }
        boolean flag = loginService.login(username,password);
        if(flag == false){
            response.sendRedirect("/login");
            return false;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {

    }
}
