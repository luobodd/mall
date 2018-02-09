package com.hwua.front.controller;

import com.alibaba.fastjson.JSON;
import com.hwua.common.po.Address;
import com.hwua.common.po.MemberCart;
import com.hwua.common.po.Orders;
import com.hwua.common.po.OrdersDetail;
import com.hwua.front.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.*;

@Controller
@RequestMapping("/orders")
public class OrdersController {
    @Autowired
    private OrdersService ordersService;
    @Autowired
    private MemberCartService memberCartService;
    @Autowired
    private OrdersDetailService ordersDetailService;
    @Autowired
    private ProductService productService;
    @Autowired
    private AddressService addressService;

    @RequestMapping("/insertOrders")
    public String insertOrders(Map<String,Object> map, HttpSession session, Orders orders, OrdersDetail ordersDetail){
        Integer memberId = (Integer) session.getAttribute("memberId");
        Double ordersPrice = memberCartService.queryMemberCartPrice(memberId);
        orders.setMemberId(memberId);
        orders.setOrdersPrice(ordersPrice);
        int i = ordersService.insertOrders(orders);
        if (i>0){
            int addSum = 0;
            int ordersMaxId = ordersService.queryOrdersMaxId(memberId);
            List<Map<String, Object>> memberCartList = memberCartService.memberCartList(memberId);
            for (Map<String,Object> productIds: memberCartList) {
                Integer productId = (Integer) productIds.get("productId");
                Integer productInCartNumber = (Integer) productIds.get("productInCartNumber");
                Double productPrice = productService.queryProductPrice(productId);
                ordersDetail.setOrdersId(ordersMaxId);
                ordersDetail.setProductId(productId);
                ordersDetail.setProductNumber(productInCartNumber);
                ordersDetail.setProductPrice(productPrice);
                addSum = ordersDetailService.insertOrdersDetail(ordersDetail);
            }
            if(addSum>0){

                return "redirect:/orders/queryMaxIdOrders";
            }
            return "error";
        }
        return "error";
    }
    @RequestMapping("/ordersPay")
    public String ordersPay(HttpSession session, HttpServletRequest request){
        Integer memberId = (Integer) session.getAttribute("memberId");
        double price = ordersService.queryOrdersMaxIdPrice(memberId);
        System.out.println("price = " + price);
        request.setAttribute("price",price);
        return "order-pay";
    }
    @RequestMapping("/queryMaxIdOrders")
    public String queryMaxIdOrders(HttpSession session, Map<String,Object> map){
        Integer memberId = (Integer) session.getAttribute("memberId");
        List<Orders> ordersList = ordersService.queryMaxIdOrders(memberId);
        System.out.println("ordersList = " + ordersList);
        int maxId = ordersService.queryOrdersMaxId(memberId);
        System.out.println("maxId = " + maxId);
        List<Map<String,Object>> ordersDetailList = ordersDetailService.queryOrdersDetail(maxId);
        System.out.println("ordersDetailList = " + ordersDetailList);
        List<Address> addressList = addressService.queryMemberAddress(memberId);
        System.out.println("addressList = " + addressList);
        map.put("ordersList",ordersList);
        map.put("ordersDetailList",ordersDetailList);
        map.put("addressList",addressList);
        System.out.println("map = " + map);
        return "order";
    }
    @RequestMapping("/submitOrders")
    public String submitOrders(HttpSession session){
        Integer memberId = (Integer) session.getAttribute("memberId");
        int i = memberCartService.deleteMemberCart(memberId);
        if (i>0){
            return "/wn-succed";
        }
        return "/error";
    }
    @RequestMapping("/queryHistoryOrders")
    public String queryHistoryOrders(HttpSession session,Map<String,Object> map){
        Integer memberId = (Integer) session.getAttribute("memberId");
        List<Integer> ordersList = ordersService.queryHistoryOrdersId(memberId);
        System.out.println("ordersList = " + ordersList);
        ArrayList<Object> arrayList = new ArrayList<>();
        for (Integer ordersId:ordersList) {
            Orders historyOrders = ordersService.queryHistoryOrders(ordersId);
            arrayList.add(historyOrders);
        String s = JSON.toJSONString(historyOrders);
        System.out.println("s = " + s);
        }
        map.put("historyOrders",arrayList);
        System.out.println("arrayList = " + arrayList);
        String s = JSON.toJSONString(arrayList);
        System.out.println("s = " + s);
        System.out.println("map = " + map);
        System.out.println("ordersList = " + ordersList);
        return "history-orders";
    }
}
