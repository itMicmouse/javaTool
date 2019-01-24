package com.yangyakun.javaTool.date;

import java.text.ParseException;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        int timeDistance = 0;
        try {
            timeDistance = getTimeDistance(new Date(), Formatter.DATE_FORMAT1.parse("2019-01-24 07:30:00"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(timeDistance);
    }
    public static int getTimeDistance(Date beginDate , Date endDate ) {

        long time = beginDate.getTime();
        System.out.println(time);
        long time1 = endDate.getTime();
        System.out.println(time1);
        System.out.println("差"+((time1-time)/1000));

        System.out.println(Formatter.DATE_FORMAT1.format(beginDate));
        System.out.println(Formatter.DATE_FORMAT1.format(endDate));

        return 0;
    }
}
