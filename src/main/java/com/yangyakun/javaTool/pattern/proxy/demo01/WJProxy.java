package com.yangyakun.javaTool.pattern.proxy.demo01;

public class WJProxy implements IShopPhone {
    // 持有目标对象引用
    private IShopPhone phone;

    public WJProxy(IShopPhone phone) {
        this.phone = phone;
    }

    @Override
    public void shop(String phoneName) {
        this.phone.shop(phoneName);
    }
}
