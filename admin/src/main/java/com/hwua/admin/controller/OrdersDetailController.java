package com.hwua.admin.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.hwua.admin.service.OrdersDetailService;
import com.hwua.common.po.OrdersDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/ordersDetail")
public class OrdersDetailController {
    @Autowired
    private OrdersDetailService ordersDetailService;
    @RequestMapping("ordersDetailProduct")
    public String queryOrdersDetailProduct(Integer ordersId,Map<String,Object> map){
        List<Map<String, Object>> ordersDetailProduct = ordersDetailService.queryOrdersDetailProduct(ordersId);
        map.put("ordersDetailProduct",ordersDetailProduct);
        map.put("ordersDetailProductSize",ordersDetailProduct.size());
        return "ordes-detail-list";
    }
    @RequestMapping("ordersDerailProductExpressPage")
    public String ordersDerailProductExpressPage(Integer ordersId,Integer productId,Map<String,Object> map){
        System.out.println("ordersId = [" + ordersId + "], productId = [" + productId + "], map = [" + map + "]");
        map.put("ordersId",ordersId);
        map.put("productId",productId);
        return "express";
    }
    @RequestMapping(value = "ordersDerailProductExpress")
    public String ordersDerailProductExpress(OrdersDetail ordersDetail){
        System.out.println("ordersDetail = " + ordersDetail);
        int i = ordersDetailService.ordersDerailProductExpress(ordersDetail);
        System.out.println("i = " + i);
        return "succed";
    }
}
