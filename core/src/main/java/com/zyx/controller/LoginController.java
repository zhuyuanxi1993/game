package com.zyx.controller;

import com.zyx.mapper.UserMapper;
import com.zyx.model.User;
import com.zyx.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){

        return "HELLO WORLD";
    }


    @RequestMapping("/login")
    public String login(){

        return "login";
    }

    @RequestMapping("/loginConfirm")
    public String loginConfirm(@RequestParam(name = "userName")String userName,
                               @RequestParam(name = "password")String password,
                               HttpServletResponse response){
//        User user = userMapper.selectUserByUserName(userName,password);
//        if (user != null){
//            Cookie cookie = new Cookie("userName",user.getUserName());
//            Cookie cookie1 = new Cookie("password",user.getPassword());
//            response.addCookie(cookie);
//            response.addCookie(cookie1);
//        }
        System.out.println(1);
        return "登陆成功";
    }
}
