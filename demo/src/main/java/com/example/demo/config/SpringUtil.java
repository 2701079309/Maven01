package com.example.demo.config;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SpringUtil implements ApplicationContextAware {
    private static ApplicationContext applicationContext1;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
           applicationContext1=applicationContext;
    }
    public static ApplicationContext getApplicationContext(){
        return applicationContext1;
    }
}
