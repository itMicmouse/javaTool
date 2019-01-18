package com.yangyakun.javaTool.pattern.proxy.demo04;

public class Client {
    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        ProxySubject proxySubject = new ProxySubject(realSubject);
        proxySubject.visit();
    }
}
