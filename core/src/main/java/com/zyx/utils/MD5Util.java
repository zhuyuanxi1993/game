package com.zyx.utils;

import org.springframework.util.DigestUtils;

public class MD5Util {
    public static String getMD5(String str, String salt) {
        String base = str + salt;
        String md5 = DigestUtils.md5DigestAsHex(base.getBytes());
        return md5;
    }
}
