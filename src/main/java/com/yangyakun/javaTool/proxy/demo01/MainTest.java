package com.yangyakun.javaTool.proxy.demo01;

public class MainTest {
    public static void main(String[] args) {
        GSShopPhone shopPhone = new GSShopPhone();
        WJProxy proxy = new WJProxy(shopPhone);
        proxy.shop("IPhone 8 价格：6880");
    }
}
