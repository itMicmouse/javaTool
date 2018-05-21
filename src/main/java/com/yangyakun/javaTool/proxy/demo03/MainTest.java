package com.yangyakun.javaTool.proxy.demo03;


import com.yangyakun.javaTool.proxy.demo03.IOrder;
import com.yangyakun.javaTool.proxy.demo03.OrderService;

import java.util.List;

public class MainTest {
    public static void main(String[] args) {

        OrderService orderService = new OrderService();
        List<IOrder> test = orderService.getOrderList("名字");
        for (IOrder iOrder : test) {
            System.out.println(iOrder.getOrderId());
        }
    }
}
