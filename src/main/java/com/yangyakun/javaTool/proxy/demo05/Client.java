package com.yangyakun.javaTool.proxy.demo05;

public class Client {
    public static void main(String[] args) {
        ILawsuit xiaoMing = new XiaoMing();

        ILawsuit lawyer = new Lawyer(xiaoMing);

        lawyer.submit();
        lawyer.burden();
        lawyer.defend();
        lawyer.finish();
    }
}
