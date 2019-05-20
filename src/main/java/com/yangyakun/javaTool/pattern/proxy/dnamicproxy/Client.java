package com.yangyakun.javaTool.pattern.proxy.dnamicproxy;

import com.yangyakun.javaTool.pattern.proxy.demo05.ILawsuit;
import com.yangyakun.javaTool.pattern.proxy.demo05.XiaoMing;
import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        ILawsuit xiaoMing = new XiaoMing();

        DynamicProxy proxy = new DynamicProxy(xiaoMing);

        ClassLoader classLoader = xiaoMing.getClass().getClassLoader();

        ILawsuit lawyer = (ILawsuit) Proxy.newProxyInstance(classLoader, new Class[]{ILawsuit.class}, proxy);
        createProxy();
        lawyer.submit();
        lawyer.burden();
        lawyer.defend();
        lawyer.finish();

        createFiel();
    }

    public static void createFiel(){
        byte[] Proxy0s = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{XiaoMing.class});
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("$Proxy0.class");
            fileOutputStream.write(Proxy0s);
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void createProxy(){
        byte[] bytes = ProxyGenerator.generateProxyClass("$porxy0", new Class<?>[]{ILawsuit.class});

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("$porxy0.class");
            fileOutputStream.write(bytes);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
