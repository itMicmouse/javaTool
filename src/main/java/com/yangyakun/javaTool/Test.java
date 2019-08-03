package com.yangyakun.javaTool;


import java.util.Calendar;
import java.util.Date;

public class Test {
    public static void main(String[] args) {

//        try {
//            name();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        String nam ="1234567";
        System.out.println(nam.length()+nam.substring(3, 7));

        char cNumber= (char) (8226);
        System.out.println(cNumber);
//        for (int i = 0; i < 1001; i++) {
//            if(i%10==0){
//                System.out.println("开始事务");
//            }
//            System.out.println(i+"index");
//            if(i%10==(10-1)){
//                System.out.println("提交事务");
//            }
//        }
//
//        String format = Formatter.DATE_FORMAT4.format(new Date());
//
//
//        // 返回开机时间，单位微妙
//        String name = "覃[=qin2]桂华";
//
//        String regx = "\\[=.+]";
//        StringBuilder currenPatient = new StringBuilder();
//        String[] split = name.split(regx);
//        for (int i = 0; i < split.length; i++) {
//            currenPatient.append(split[i]);
//        }
//        System.out.println(currenPatient.toString());
//
//
//        long l = System.currentTimeMillis();
//        String dateStart;
//        if(Math.abs(1547089375 - 1547089499) > (60 * 60 * 24 * 30)){
//            Calendar calendar = Calendar.getInstance();
//            calendar.setTime(new Date());
//            calendar.set(Calendar.HOUR_OF_DAY, 0);
//            calendar.set(Calendar.MINUTE, 0);
//            calendar.set(Calendar.SECOND, 0);
//            Date zero = calendar.getTime();
//            dateStart = Formatter.DATE_FORMAT1.format(zero);
//            System.out.println(dateStart);
//        }else {
//           // dateStart = Formatter.DATE_FORMAT1.format(openDate);
//            System.out.println("name");
//        }
    }

    public static void name(){
        System.out.println("11111");
        throw new NullPointerException("");
    }
}
