package com.hwua.admin.service;

import com.hwua.common.po.Orders;

import java.util.List;
import java.util.Map;

public interface OrdersService {
    public List<Map<String,Object>> ordersList();
    public int ordersSuccess(Integer ordersId);
}
