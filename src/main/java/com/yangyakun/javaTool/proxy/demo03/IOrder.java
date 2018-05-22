package com.yangyakun.javaTool.proxy.demo03;

public interface IOrder {
    String getOrderId();

    void setOrderId(String orderId);

    String getOrderName();

    void setOrderName(String orderName);

    String getOrderPrice();

    void setOrderPrice(String orderPrice);

    String getOrderUserName();

    void setOrderUserName(String orderUserName);

    String toString();
}
