package com.yangyakun.javaTool;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        // 返回开机时间，单位微妙
        String name = "覃[=qin2]桂华";

        String regx = "\\[=.+]";
        StringBuilder currenPatient = new StringBuilder();
        String[] split = name.split(regx);
        for (int i = 0; i < split.length; i++) {
            currenPatient.append(split[i]);
        }
        System.out.println(currenPatient.toString());
    }
}
