package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dua")
public class combaby {
    @PostMapping("/fak")
    public String[] yanga(){
        String []arr=new String[3];
        arr[0]="坤";
        arr[1]="rap";
        arr[2]="篮球";
        for(String s:arr){
            System.out.println(s);
        }
        return arr;
    }

//    http://localhost:8080/dua/fak
}
