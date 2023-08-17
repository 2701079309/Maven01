package com.example.demo.interceptor;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class Systemintercceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//       String isLogin=request.getParameter("isLogin");
//       String URL=request.getRequestURI();
//       String meoth=request.getMethod();
//       System.out.println(isLogin);
//        System.out.println(URL);
//        System.out.println(meoth);
//        if(isLogin==null||isLogin.equals("false")){
//            return false;
//        }
        String token=request.getHeader("token");
        if(token==null){
            return false;
        }
       DecodedJWT djwt= JWT.require(Algorithm.HMAC384("root")).build().verify(token);
        String loginName=djwt.getClaim("loginName").asString();
        System.out.println(loginName);
        System.out.println(djwt.getExpiresAt());
       return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }
}
