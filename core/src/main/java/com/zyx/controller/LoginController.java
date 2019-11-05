package com.zyx.controller;

import com.zyx.mapper.UserMapper;
import com.zyx.model.User;
import com.zyx.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/hello")
    @ResponseBody
    public String Hello(@CookieValue(name = "isLogin")String loginName){

        return "已登录用户" + loginName;
    }

    @RequestMapping("/login")
    @ResponseBody
    public String Login(HttpServletResponse response, HttpServletRequest request){
        String userName = (String)request.getParameter("userName");
        String password = (String)request.getParameter("password");
        User user = userMapper.selectUserByUserName(userName);
        if(user != null && user.getPassword().equals(password)){
            Cookie cookie = new Cookie("isLogin","true");
            cookie.setMaxAge(300);
            response.addCookie(cookie);
        }
        return "已登录";
    }
}
