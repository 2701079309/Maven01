package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@ControllerAdvice
@RestController
public class errorHtml {
    @ExceptionHandler({Exception.class})
    public Map<String,Object> handlerExcaption(Exception e){
        Map<String,Object> m=new HashMap<>();
        System.out.println("======");
        m.put("error","页面不存在"+e.toString());
        return m;
    }

}

