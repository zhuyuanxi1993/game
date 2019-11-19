package com.zyx.service.impl;

import com.zyx.mapper.UserMapper;
import com.zyx.model.User;
import com.zyx.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public boolean login(String userName, String password) {
        boolean flag = false;
        User user = userMapper.selectUserByUserName(userName, password);
        if (user != null){
            flag = true;
        }
        return flag;
    }
}
