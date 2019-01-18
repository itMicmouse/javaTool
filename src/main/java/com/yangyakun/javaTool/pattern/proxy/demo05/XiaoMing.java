package com.yangyakun.javaTool.pattern.proxy.demo05;

public class XiaoMing implements ILawsuit {
    @Override
    public void submit() {
        System.out.println("老板拖欠工资！特申请仲裁");
    }

    @Override
    public void burden() {
        System.out.println("这是合同书和过去一年的银行工资流水");
    }

    @Override
    public void defend() {
        System.out.println("证据确凿！不需要辩护了");
    }

    @Override
    public void finish() {
        System.out.println("诉讼成功！判7天内结算工资");
    }
}
