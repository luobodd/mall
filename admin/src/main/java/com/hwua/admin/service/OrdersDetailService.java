package com.hwua.admin.service;

import com.hwua.common.po.OrdersDetail;

import java.util.List;
import java.util.Map;

public interface OrdersDetailService {
    public List<Map<String,Object>> queryOrdersDetailProduct(Integer ordersId);
    public int ordersDerailProductExpress(OrdersDetail ordersDetail);
}
