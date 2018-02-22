package com.luobodd.admin.controller;

import com.alibaba.fastjson.JSON;
import com.luobodd.admin.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/orders")
public class OrdersController {
    @Autowired
    private OrdersService ordersService;
    @RequestMapping("/ordersList")
    public String ordersList(Map<String,Object> map){
        List<Map<String,Object>> ordersList = ordersService.ordersList();
        String s = JSON.toJSONString(ordersList);
        System.out.println("s = " + s);
        map.put("ordersList",ordersList);
        map.put("ordersListSize",ordersList.size());
        return "ordes-list";
    }
    @RequestMapping("ordersSuccess")
    public String orderSuccess(Integer ordersId){
        System.out.println("ordersId = " + ordersId);
        int i = ordersService.ordersSuccess(ordersId);
        System.out.println("i = " + i);
        return "redirect:/orders/ordersList";
    }
}
