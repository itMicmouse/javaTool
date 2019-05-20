package com.yangyakun.javaTool.pattern.proxy.myproxy;

import java.lang.reflect.Method;

public class DynamicProxy implements MyInvocationHandler {

    private Object object;

    public DynamicProxy(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object invoke = method.invoke(object, args);
        return invoke;
    }
}
