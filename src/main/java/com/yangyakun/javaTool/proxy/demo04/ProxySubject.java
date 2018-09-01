package com.yangyakun.javaTool.proxy.demo04;

public class ProxySubject extends Subject {

    private RealSubject realSubject;

    public ProxySubject(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void visit() {
        this.realSubject.visit();
    }
}
