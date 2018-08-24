package com.yangyakun.javaTool.singleton.demo04;

public class Singleton {
    private Singleton() {
    }
    public static Singleton getInstance(){
        return SingletonHolder.mSingleton;
    }
    private static class SingletonHolder{
        private static final Singleton mSingleton = new Singleton();
    }
}
