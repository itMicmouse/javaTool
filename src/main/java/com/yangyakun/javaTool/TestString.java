package com.yangyakun.javaTool;

public class TestString {

    String str = new String("haha");
    char[] ch = {'a','b'};

    public void change(int x,String str,char ch[]){
        x = 2;
        str.replace("a","e");
        ch[0] = 'c';
    }

    public static void main(String[] args) {
        int i =1;
        TestString testString = new TestString();
        testString.change(i,testString.str,testString.ch);
        System.out.println(i+"");
        System.out.println(testString.str);
        System.out.println(testString.ch);
    }
}
