package com.yangyakun.javaTool.util;

import com.yangyakun.javaTool.date.Formatter;

import java.util.Calendar;
import java.util.Date;

public class WakeUp {
    private static final String TAG = "WakeUp";

    public static void writeProp(boolean type, int switchs, int time) {
        Date date = new Date();
        String format = Formatter.DATE_FORMAT8.format(date);
        String format1 = Formatter.DATE_FORMAT13.format(time);
        StringBuilder standby = new StringBuilder();
        if(type){
            Calendar c = Calendar.getInstance();
            c.setTime(date);
            c.add(Calendar.DAY_OF_MONTH, 1);
            format = Formatter.DATE_FORMAT8.format( c.getTime());
            standby.append("setprop persist.sys.wakeup");
        }else {
            standby.append("setprop persist.sys.standby");
        }
        standby.append(" ").append(switchs).append(format).append(format1);
        System.out.println(standby);
    }//120181221090000

}
