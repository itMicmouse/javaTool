package com.yangyakun.javaTool.pattern.proxy.demo04;

public class RealSubject extends Subject {
    @Override
    public void visit() {
        System.out.println("Real Subject");
    }
}
