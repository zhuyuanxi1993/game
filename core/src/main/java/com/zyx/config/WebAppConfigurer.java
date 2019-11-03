//package com.zyx.config;
//
//import com.zyx.interceptor.LoginInterceptor;
//
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//public class WebAppConfigurer implements WebMvcConfigurer{
//
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/**");                    //所有路径都被拦截
////        registration.excludePathPatterns("/","/login","/error","/static/**","/logout");       //添加不拦截路径
//
//    }
//}
