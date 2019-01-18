package com.yangyakun.javaTool.pattern.singleton.demo03;

/**
 * DLC 方式实现
 */
public class Singleton {
    private volatile static Singleton mSingleton = null;

    private Singleton() {}
    public static Singleton getInstance(){
        if(mSingleton==null){
            synchronized (Singleton.class){
                if(mSingleton==null){
                    mSingleton = new Singleton();
                }
            }
        }
        return mSingleton;
    }
}
