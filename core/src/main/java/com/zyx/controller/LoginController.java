package com.zyx.controller;

import com.zyx.mapper.UserMapper;
import com.zyx.model.User;
import com.zyx.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/hello")
    @ResponseBody
    public String Hello(){
//        List<User> userList = userMapper.selectUserList();
        User user = userMapper.selectUserByUserName("zhuyuanxi","zhuyuanxi");
//        return userList.toString();
        return user.toString();
    }


    @RequestMapping("/login")
    public String Login(){
        return "login";
    }
}
