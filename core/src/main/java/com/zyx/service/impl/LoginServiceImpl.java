package com.zyx.service.impl;

import com.alibaba.druid.util.StringUtils;
import com.zyx.Constants.ResCodeEnum;
import com.zyx.mapper.UserMapper;
import com.zyx.model.User;
import com.zyx.service.LoginService;
import com.zyx.utils.HttpUtils;
import com.zyx.utils.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public boolean login(HttpServletRequest request) {
        String loginName = HttpUtils.getCookieVal(request,"loginName");
        String password = HttpUtils.getCookieVal(request,"password");
        User user = userMapper.selectUserByLoginName(loginName);
        if(user != null) {
            String currentPassword = MD5Util.getMD5(password,user.getSalt());
            if(StringUtils.isEmpty(currentPassword)){
                return false;
            }
            if(currentPassword.equals(user.getPassword())){
                return true;
            }else{
                return false;
            }
        } else {
            return false;
        }
        return false;
    }
}
