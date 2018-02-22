package com.luobodd.common.dao;

import com.luobodd.common.po.Orders;

import java.util.List;
import java.util.Map;

public interface OrdersMapper {
    /**
     * 购物车添加至订单
     * @param orders
     * @return
     */
    public int insertOrders(Orders orders);

    /**
     * 通过用户Id查询最新的订单Id
     * @param memberId
     * @return
     */
    public int queryOrdersMaxId(Integer memberId);

    /**
     * 查询当前用户最新的订单价格
     * @param memberId
     * @return
     */
    public double queryOrdersMaxIdPrice(Integer memberId);

    /**
     * 查询最新订单详情
     * @param memberId
     * @return
     */
    public List<Orders> queryMaxIdOrders(Integer memberId);

    /**
     * 查询用户历史订单
     * @param ordersId
     * @return
     */
    public Orders queryHistoryOrders(Integer ordersId);

    /**
     * 查询历史订单id
     * @param memberId
     * @return
     */
    public List<Integer> queryHistoryOrdersId(Integer memberId);


    /**
     * 所有订单
     * @return
     */
    public List<Map<String,Object>> ordersList();

    /**
     * 订单的完成
     * @param ordersId
     * @return
     */
    public int ordersSuccess(Integer ordersId);
}
