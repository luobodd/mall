package com.luobodd.admin.service.impl;

import com.luobodd.admin.service.OrdersDetailService;
import com.luobodd.common.dao.OrdersDetailMapper;
import com.luobodd.common.po.OrdersDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@SuppressWarnings("SpringJavaAutowiringInspection")
@Service("ordersDetailService")
public class OrdersDetailServiceImpl implements OrdersDetailService {
    @Autowired
    private OrdersDetailMapper ordersDetailMapper;

    @Override
    public List<Map<String, Object>> queryOrdersDetailProduct(Integer ordersId) {
        return ordersDetailMapper.queryOrdersDetailProduct(ordersId);
    }

    @Override
    public int ordersDerailProductExpress(OrdersDetail ordersDetail) {
        return ordersDetailMapper.ordersDerailProductExpress(ordersDetail);
    }
}
