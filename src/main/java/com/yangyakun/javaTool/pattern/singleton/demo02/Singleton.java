package com.yangyakun.javaTool.pattern.singleton.demo02;

/**
 * 懒汉模式
 */
public class Singleton {
    private static Singleton mSingleton;

    private Singleton() {}

    public static synchronized Singleton getmSingleton() {
        if(mSingleton==null){
            mSingleton = new Singleton();
        }
        return mSingleton;
    }
}
