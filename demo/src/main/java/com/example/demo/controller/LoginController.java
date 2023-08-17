package com.example.demo.controller;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;

@RestController
@RequestMapping("/login")
public class LoginController {
    @PostMapping("/dologin.do")
    public String dologin(String loginName,String password){
        if("root".equals(loginName)&&"root".equals(password)){
            Calendar calendar=Calendar.getInstance();
            calendar.add(Calendar.DAY_OF_MONTH,1);
            String token=JWT.create().withClaim("loginName",loginName)
                    .withClaim("isLogin",true)
                    .withExpiresAt(calendar.getTime())
                    .sign(Algorithm.HMAC384("root"));
            System.out.println(token);
            return token;
        }
        return null;
    }
}
