package com.yangyakun.javaTool.pattern.proxy.demo01;

public class GSShopPhone implements IShopPhone {
    @Override
    public void shop(String phoneName) {
        System.out.println("具体对象->手机名称：" + phoneName);
    }
}
