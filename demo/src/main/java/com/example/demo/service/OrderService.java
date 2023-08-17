package com.example.demo.service;

import com.example.demo.entity.goods;
import com.example.demo.entity.order1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderService {
    @Autowired
    private goodsdao goodsdao;
    @Autowired
    private orderdao orderdao;

    @Transactional
    public int createOrder(int goods_id,int count){
        goods god = goodsdao.selectgoods(goods_id);
        int newNum=god.getNum()-count;
        god.setNum(newNum);
        goodsdao.update(god);

        order1 or=new order1();
        or.setGoods_id(goods_id);
        or.setCount(count);
        int aff=orderdao.insertorder(or);
        return aff;
    }
}
