package com.guizKev.api.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guizKev.api.domain.service.order.OrderService;
import com.guizKev.api.persistence.entity.Order;

@RestController
@RequestMapping(value = "/order")
public class OrderController {

    @Autowired 
    private OrderService orderService ;

    @GetMapping("/all")
    public List<Order> getAllOrder(){
        return orderService.getAllOrder() ;
    }

}
