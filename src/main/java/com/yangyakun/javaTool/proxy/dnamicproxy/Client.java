package com.yangyakun.javaTool.proxy.dnamicproxy;

import com.yangyakun.javaTool.proxy.demo05.ILawsuit;
import com.yangyakun.javaTool.proxy.demo05.Lawyer;
import com.yangyakun.javaTool.proxy.demo05.XiaoMing;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        ILawsuit xiaoMing = new XiaoMing();

        DynamicProxy proxy = new DynamicProxy(xiaoMing);

        ClassLoader classLoader = xiaoMing.getClass().getClassLoader();

        ILawsuit lawyer = (ILawsuit) Proxy.newProxyInstance(classLoader, new Class[]{ILawsuit.class}, proxy);

        lawyer.submit();
        lawyer.burden();
        lawyer.defend();
        lawyer.finish();
    }
}
