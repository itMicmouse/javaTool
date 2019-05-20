package com.yangyakun.javaTool.pattern.proxy.myproxy;


import java.lang.reflect.Method;

public class MyProxy {

    public static String rn = "\r\n";

    public static Object newProxyInstance(ClassLoader loader,
                                          Class<?>[] interfaces,
                                          MyInvocationHandler h) {
        //生成一个java类
        String proxyJava = "package com.yangyakun.javaTool.pattern.proxy.myproxy" + rn
                + "import java.lang.reflect.Method;" + rn
                + "public final class $porxy0 extends Proxy implements ILawsuit {" + rn
                + "MyInvocationHandler h" + rn
                + "public $porxy0(MyInvocationHandler h) {" + rn
                + "this.h=h;" + rn
                + "}" + rn + createMethod(interfaces);

        return null;
    }

    private static String createMethod(Class<?>[] interfaces) {
        String result = "";
        for (Class<?> anInterface : interfaces) {
            Method[] methods = anInterface.getMethods();
            for (Method method : methods) {
                result += "public final void submit() throws Exception " + rn
                +"{"+rn
                +"";
            }
        }
        return result;
    }
}
