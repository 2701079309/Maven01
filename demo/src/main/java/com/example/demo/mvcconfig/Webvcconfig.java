package com.example.demo.mvcconfig;

import com.example.demo.interceptor.Systemintercceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class Webvcconfig implements WebMvcConfigurer {
    @Autowired
    private Systemintercceptor systemintercceptor;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(systemintercceptor).addPathPatterns("/**")
//                .excludePathPatterns("/login/**");
    }
}
