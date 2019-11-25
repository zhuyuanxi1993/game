package com.zyx.service.impl;

import com.zyx.mapper.UserMapper;
import com.zyx.model.User;
import com.zyx.service.LoginService;
import com.zyx.utils.MD5Util;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public boolean login(HttpServletRequest request, HttpServletResponse response) {
        String loginName = request.getParameter("loginName");
        String password = request.getParameter("password");
        if (StringUtils.isEmpty(loginName) || StringUtils.isEmpty(password)){
            return false;
        }else {
            User user = userMapper.selectUserByLoginName(loginName);
            if (user != null) {
                String currentPassword = MD5Util.getMD5(password, user.getSalt());
                if (StringUtils.isEmpty(currentPassword)) {
                    return false;
                }
                if (currentPassword.equals(user.getPassword())) {
                    Cookie cookie1 = new Cookie("isLogin", "1");
                    cookie1.setMaxAge(60 * 10);
                    Cookie cookie2 = new Cookie("loginName", loginName);
                    response.addCookie(cookie1);
                    response.addCookie(cookie2);
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
    }
}
