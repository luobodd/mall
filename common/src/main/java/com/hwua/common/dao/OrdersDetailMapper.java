package com.hwua.common.dao;

import com.hwua.common.po.OrdersDetail;

import java.util.List;
import java.util.Map;

public interface OrdersDetailMapper {
    /**
     * 添加到订单详情
     * @param ordersDetail
     * @return
     */
    public int insertOrdersDetail(OrdersDetail ordersDetail);

    /**
     * 根据订单Id查询订单内的详细
     * @param ordersId
     * @return
     */
    public List<Map<String,Object>> queryOrdersDetail(Integer ordersId);

    /**
     * 查询订单详情内商品的详细信息
     * @param ordersId
     * @return
     */
    public List<Map<String,Object>> queryOrdersDetailProduct(Integer ordersId);

    /**
     * 快递信息的修改
     * @param ordersDetail
     * @return
     */
    public int ordersDerailProductExpress(OrdersDetail ordersDetail);
}
