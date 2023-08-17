package com.example.demo.service;

import com.example.demo.entity.order1;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface orderdao {
    public int insertorder(order1 order);
}
