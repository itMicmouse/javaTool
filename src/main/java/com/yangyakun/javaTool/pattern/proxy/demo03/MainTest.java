package com.yangyakun.javaTool.pattern.proxy.demo03;


import java.util.List;

public class MainTest {
    public static void main(String[] args) {

        OrderService orderService = new OrderService();
        List<IOrder> test = orderService.getOrderList("亚坤1");
        for (IOrder iOrder : test) {
            System.out.println("订单id:"+iOrder.getOrderId()+"  订单名称:"+iOrder.getOrderName()
            +"  订单价格："+iOrder.getOrderPrice());
        }
    }
}
