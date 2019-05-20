package com.yangyakun.javaTool.pattern.proxy.dnamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler {

    private Object object;

    public DynamicProxy(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("----------------before------------------");
        Object invoke = method.invoke(object, args);
        System.out.println("----------------after------------------");
        return null;
    }
}
