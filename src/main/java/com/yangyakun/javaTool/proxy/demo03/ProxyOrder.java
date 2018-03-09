package com.yangyakun.javaTool.proxy.demo03;

public class ProxyOrder implements IOrder {

    private IOrder order;
    private String name;

    public ProxyOrder(IOrder order,String name) {
        this.order = order;
        this.name = name;
    }

    @Override
    public String getOrderId() {
        return order.getOrderId();
    }

    @Override
    public void setOrderId(String orderId) {
        this.order.setOrderId(orderId);
    }

    @Override
    public String getOrderName() {
        return this.order.getOrderName();
    }

    @Override
    public void setOrderName(String orderName) {
        this.order.setOrderName(orderName);
    }

    @Override
    public String getOrderPrice() {
        return order.getOrderPrice();
    }

    @Override
    public void setOrderPrice(String orderPrice) {
        this.order.setOrderPrice(orderPrice);
    }

    @Override
    public String getOrderUserName() {
        return this.order.getOrderUserName();
    }

    @Override
    public void setOrderUserName(String orderUserName) {
        this.order.setOrderName(orderUserName);
    }
}
