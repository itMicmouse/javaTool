package com.yangyakun.javaTool.singleton.demo01;

public class CEO extends Staff {
    private static final CEO mCEO = new CEO();

    private CEO() {
    }

    public static CEO getCeo(){
        return mCEO;
    }

    @Override
    public void work() {
        super.work();
    }
}
