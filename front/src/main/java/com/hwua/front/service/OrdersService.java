package com.hwua.front.service;

import com.hwua.common.po.Orders;

import java.util.List;
import java.util.Map;

public interface OrdersService {
    public int insertOrders(Orders orders);
    public int queryOrdersMaxId(Integer memberId);
    public double queryOrdersMaxIdPrice(Integer memberId);
    public List<Orders> queryMaxIdOrders(Integer memberId);
    public Orders queryHistoryOrders(Integer ordersId);
    public List<Integer> queryHistoryOrdersId(Integer memberId);
}
