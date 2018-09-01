package com.yangyakun.javaTool.proxy.demo05;

public class Lawyer implements ILawsuit {

    private ILawsuit iLawsuit;

    public Lawyer(ILawsuit iLawsuit) {
        this.iLawsuit = iLawsuit;
    }

    @Override
    public void submit() {
        iLawsuit.submit();
    }

    @Override
    public void burden() {
        iLawsuit.burden();
    }

    @Override
    public void defend() {
        iLawsuit.defend();
    }

    @Override
    public void finish() {
        iLawsuit.finish();
    }
}
