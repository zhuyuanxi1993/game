package com.zyx.service;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface LoginService {
    public boolean login(HttpServletRequest request, HttpServletResponse response);
}
