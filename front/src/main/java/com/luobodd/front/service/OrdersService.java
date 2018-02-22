package com.luobodd.front.service;

import com.luobodd.common.po.Orders;

import java.util.List;

public interface OrdersService {
    public int insertOrders(Orders orders);
    public int queryOrdersMaxId(Integer memberId);
    public double queryOrdersMaxIdPrice(Integer memberId);
    public List<Orders> queryMaxIdOrders(Integer memberId);
    public Orders queryHistoryOrders(Integer ordersId);
    public List<Integer> queryHistoryOrdersId(Integer memberId);
}
