package com.hwua.front.service;

import com.hwua.common.po.OrdersDetail;

import java.util.List;
import java.util.Map;

public interface OrdersDetailService {
    public int insertOrdersDetail(OrdersDetail ordersDetail);
    public List<Map<String,Object>> queryOrdersDetail(Integer ordersId);

}
