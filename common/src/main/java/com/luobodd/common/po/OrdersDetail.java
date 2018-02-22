package com.luobodd.common.po;

public class OrdersDetail {
    private Integer ordersId;
    private Integer productId;
    private Integer productNumber;
    private Double productPrice;
    private String productName;
    private String express;

    @Override
    public String toString() {
        return "OrdersDetail{" +
                "ordersId=" + ordersId +
                ", productId=" + productId +
                ", productNumber=" + productNumber +
                ", productPrice=" + productPrice +
                ", productName='" + productName + '\'' +
                ", express='" + express + '\'' +
                '}';
    }

    public String getExpress() {
        return express;
    }

    public void setExpress(String express) {
        this.express = express;
    }

    public OrdersDetail() {
    }

    public Integer getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(Integer ordersId) {
        this.ordersId = ordersId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(Integer productNumber) {
        this.productNumber = productNumber;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
