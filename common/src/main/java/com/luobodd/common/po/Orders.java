package com.luobodd.common.po;

import java.sql.Timestamp;
import java.util.List;

public class Orders {
    private Integer ordersId;
    private Integer memberId;
    private Timestamp ordersTime;
    private Double ordersPrice;
    private List<OrdersDetail> ordersDetails;

    @Override
    public String toString() {
        return "Orders{" +
                "ordersId=" + ordersId +
                ", memberId=" + memberId +
                ", ordersTime=" + ordersTime +
                ", ordersPrice=" + ordersPrice +
                ", ordersDetails=" + ordersDetails +
                '}';
    }

    public Orders() {
    }

    public Integer getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(Integer ordersId) {
        this.ordersId = ordersId;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Timestamp getOrdersTime() {
        return ordersTime;
    }

    public void setOrdersTime(Timestamp ordersTime) {
        this.ordersTime = ordersTime;
    }

    public Double getOrdersPrice() {
        return ordersPrice;
    }

    public void setOrdersPrice(Double ordersPrice) {
        this.ordersPrice = ordersPrice;
    }

    public List<OrdersDetail> getOrdersDetails() {
        return ordersDetails;
    }

    public void setOrdersDetails(List<OrdersDetail> ordersDetails) {
        this.ordersDetails = ordersDetails;
    }
}
