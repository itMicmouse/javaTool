package com.yangyakun.javaTool.pattern.proxy.demo02;

import java.util.List;

public class MainTest {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        List<OrderBean> orderList = orderService.getOrderList();
        for (OrderBean orderBean : orderList) {
            System.out.println(orderBean);
        }
    }
}
