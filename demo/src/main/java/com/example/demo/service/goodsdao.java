package com.example.demo.service;

import com.example.demo.entity.goods;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface goodsdao {
    public goods selectgoods(int goods_id);

    public int update(goods goods);
}
