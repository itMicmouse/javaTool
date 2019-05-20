package com.yangyakun.javaTool.order;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class Test {
    public static void main(String[] args) {
        List<WaitPatientBean> list = new ArrayList<>();
            WaitPatientBean waitPatientBean;
        for (int i = 0; i < 30; i++) {
            waitPatientBean = new WaitPatientBean();
            waitPatientBean.setPatientName("天台"+i);
            waitPatientBean.setPatientNo(i+"");
            if(i%2==0) {
                waitPatientBean.setStatus("0");
            }else {
                waitPatientBean.setStatus("1");
            }
            waitPatientBean.setSubscribeId(UUID.randomUUID().toString());
            list.add(waitPatientBean);
        }
        Collections.sort(list);
        System.out.println(list.toString());
    }
}
