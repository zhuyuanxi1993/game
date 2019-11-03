//package com.zyx.interceptor;
//
//
//import com.zyx.service.LoginService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.lang.Nullable;
//import org.springframework.stereotype.Component;
//import org.springframework.web.servlet.HandlerInterceptor;
//import org.springframework.web.servlet.ModelAndView;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
//@Component
//public class LoginInterceptor implements HandlerInterceptor{
//
//    @Autowired
//    private LoginService loginService;
//
//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
////        HttpSession session = request.getSession();
//        String username = (String)request.getAttribute("username");
//        String password = (String)request.getAttribute("password");
//        boolean flag = loginService.login(username,password);
//        if(flag == false){
//            response.sendRedirect("/login");
//        }
//        return true;
//    }
//
//    @Override
//    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
//
//    }
//
//    @Override
//    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
//
//    }
//}
