package com.luobodd.front.service.impl;

import com.luobodd.common.dao.OrdersDetailMapper;
import com.luobodd.common.po.OrdersDetail;
import com.luobodd.front.service.OrdersDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Map;

@SuppressWarnings("SpringJavaAutowiringInspection")
@Controller("ordersDetailService")
public class OrderDetailServiceImpl implements OrdersDetailService {
    @Autowired
    private OrdersDetailMapper ordersDetailMapper;
    @Override
    public int insertOrdersDetail(OrdersDetail ordersDetail) {
        return ordersDetailMapper.insertOrdersDetail(ordersDetail);
    }

    @Override
    public List<Map<String,Object>> queryOrdersDetail(Integer ordersId) {
        return ordersDetailMapper.queryOrdersDetail(ordersId);
    }
}
