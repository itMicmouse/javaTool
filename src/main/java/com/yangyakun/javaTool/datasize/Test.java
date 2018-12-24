package com.yangyakun.javaTool.datasize;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<WaitPatientBean> waitPatientBeans = new ArrayList<>();
        WaitPatientBean waitPatientBean = new WaitPatientBean();
        for (int i = 0; i < 10; i++) {
            waitPatientBean = new WaitPatientBean();
            waitPatientBeans.add(waitPatientBean);
        }
        List<WaitPatientBean> waitPatientBeans1 = waitPatientBeans.subList(0, 6);
        System.out.println();
    }
}
