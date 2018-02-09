package com.hwua.admin.service.impl;

import com.hwua.admin.service.OrdersService;
import com.hwua.common.dao.OrdersMapper;
import com.hwua.common.po.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@SuppressWarnings("SpringJavaAutowiringInspection")
@Service("ordersService")
public class OrdersServiceImpl implements OrdersService {
    @Autowired
    private OrdersMapper ordersMapper;
    @Override
    public List<Map<String,Object>> ordersList() {
        return ordersMapper.ordersList();
    }

    @Override
    public int ordersSuccess(Integer ordersId) {
        return ordersMapper.ordersSuccess(ordersId);
    }
}
