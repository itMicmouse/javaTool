package com.yangyakun.javaTool.pattern.observable;

public class Test {
    public static void main(String[] args) {
        DevTechFrontier devTechFrontier = new DevTechFrontier();
        Coder coder = new Coder("杨亚坤");
        Coder coder2 = new Coder("耿小敏");
        Coder coder3 = new Coder("李浩");
        Coder coder4 = new Coder("赵楠");
        devTechFrontier.addObserver(coder);
        devTechFrontier.addObserver(coder2);
        devTechFrontier.addObserver(coder3);
        devTechFrontier.addObserver(coder4);

        devTechFrontier.postNetPublic("新的内容");

    }
}
