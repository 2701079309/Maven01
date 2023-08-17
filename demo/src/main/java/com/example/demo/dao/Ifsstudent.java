package com.example.demo.dao;

import com.example.demo.entity.Well;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface Ifsstudent {
        List<Well> listwell();
    }
