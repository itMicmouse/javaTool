package com.yangyakun.javaTool.clone;

public class TestCloneInterface implements Cloneable {
    String name;
    int age;

    TestCloneInterface(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Object clone() {
        Object o = null;
        try {
            o =  super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return o;
    }

    public static void main(String[] args) {
        TestCloneInterface s1 = new TestCloneInterface("aa", 18);
        TestCloneInterface s2 = (TestCloneInterface) s1.clone();
        s2.name = "bb";
        s2.age = 20;
        System.out.println("s1:~name=" + s1.name + "," + "age=" + s1.age);
        System.out.println("s2:~name=" + s2.name + "," + "age=" + s2.age);
    }

}