package com.zyx.utils;

import com.zyx.Constants.ResCodeEnum;
import org.apache.commons.lang.StringUtils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

public class HttpUtils {
    public static String getCookieVal(HttpServletRequest request, String cookieKey){
        Cookie[] cookies = request.getCookies();
        if (StringUtils.isEmpty(cookieKey)){
            return null;
        }
        for (Cookie cookie : cookies) {
            if (cookieKey.equals(cookie.getName())){
               return cookie.getValue();
            }
        }
        return null;
    }
}
