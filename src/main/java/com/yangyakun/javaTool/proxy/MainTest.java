package com.yangyakun.javaTool.proxy;


import com.yangyakun.javaTool.proxy.demo03.IOrder;
import com.yangyakun.javaTool.proxy.demo03.OrderService;

import java.util.List;

public class MainTest {
    public static void main(String[] args) {
//         GSShopPhone shopPhone = new GSShopPhone();
//         WJProxy proxy = new WJProxy(shopPhone);
//         proxy.shop("IPhone 8 价格：6880");

//        OrderService orderService = new OrderService();
//        List<OrderBean> orderList = orderService.getOrderList();
//        for (OrderBean orderBean : orderList) {
//            System.out.println(orderBean);
//        }

        OrderService orderService = new OrderService();
        List<IOrder> test = orderService.getOrderList("亚坤");

        for (IOrder iOrder : test) {
            System.out.println(iOrder.getOrderId());
        }


    }
}
