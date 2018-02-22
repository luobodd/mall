package com.luobodd.front.service.impl;

import com.luobodd.common.dao.OrdersMapper;
import com.luobodd.common.po.Orders;
import com.luobodd.front.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@SuppressWarnings("SpringJavaAutowiringInspection")
@Service("ordersService")
public class OrdersServiceImpl implements OrdersService {
    @Autowired
    private OrdersMapper ordersMapper;
    @Override
    public int insertOrders(Orders orders) {
        return ordersMapper.insertOrders(orders);
    }

    @Override
    public int queryOrdersMaxId(Integer memberId) {
        return ordersMapper.queryOrdersMaxId(memberId);
    }

    @Override
    public double queryOrdersMaxIdPrice(Integer memberId) {
        return ordersMapper.queryOrdersMaxIdPrice(memberId);
    }

    @Override
    public List<Orders> queryMaxIdOrders(Integer memberId) {
        return ordersMapper.queryMaxIdOrders(memberId);
    }

    @Override
    public Orders queryHistoryOrders(Integer ordersId) {
        return ordersMapper.queryHistoryOrders(ordersId);
    }

    @Override
    public List<Integer> queryHistoryOrdersId(Integer memberId) {
        return ordersMapper.queryHistoryOrdersId(memberId);
    }

}
