package com.zyx.controller;

import com.alibaba.fastjson.JSONObject;
import com.zyx.Constants.ResCodeEnum;
import com.zyx.mapper.UserMapper;
import com.zyx.service.LoginService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(HttpServletRequest request){
        Cookie[] cookies = request.getCookies();

        return "HELLO WORLD";
    }


    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/loginConfirm")
    @ResponseBody
    public String loginConfirm(HttpServletRequest request, HttpServletResponse response){

        Map<String,String> retMap = getCookieVal(request,"userName");
        Map<String,String>
        String retStr = JSONObject.toJSONString(retMap);

        return retStr;
    }

}
