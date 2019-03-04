package com.yangyakun.javaTool.math;

import com.yangyakun.javaTool.date.Formatter;
import com.yangyakun.javaTool.util.WakeUp;

import java.util.Date;

public class Exchege {
    public static void main(String[] args) {
        WakeUp.writeProp(true,1,-1800000);
        WakeUp.writeProp(false,1,57000000);
        System.out.println(WakeUp.writeProp1(57000000));
        String format = Formatter.DATE_FORMAT13.format(System.currentTimeMillis());
        System.out.println(format);
    }
}
