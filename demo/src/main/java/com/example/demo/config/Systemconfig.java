package com.example.demo.config;

import com.example.demo.service.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class Systemconfig {
    @Value("${server.port}")
    private int port;
    @Bean("mystudent")
    public Student getst(){
        Student st =new Student();
        st.setName("张无忌");
        st.setId(this.port);
         return st;
     }
}
