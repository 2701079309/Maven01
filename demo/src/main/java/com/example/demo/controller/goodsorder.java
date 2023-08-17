package com.example.demo.controller;

import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/oders")
public class goodsorder {
    @Autowired
    private OrderService orderService;
    @PostMapping("/good/{goods_id}/{count}")
            public int selectgoods(@PathVariable int goods_id, @PathVariable int count){
                        return this.orderService.createOrder(goods_id,count);

            }

}
