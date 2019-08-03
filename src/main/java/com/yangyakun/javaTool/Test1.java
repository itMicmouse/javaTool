package com.yangyakun.javaTool;

public class Test1 {
    public static void main(String[] args) {
        Thread t = new Thread(){
            @Override
            public void run() {
                super.run();
                dianping();
            }
        };
        t.run();
        System.out.print("dazhong");

        String abc = "abcabc";
        String replace = abc.replace('b', 'a');
        System.out.println(replace);
        System.out.println(abc);

        Long l1 = 128L;
        Long l2 = 128L;
        Long l3 = 127L;
        Long l4 = 127L;
        System.out.println(l1==l2);
        System.out.println(l1==128L);
        System.out.println(l3==l4);
    }
    static void dianping(){
        System.out.print("dianping");
    }
}
