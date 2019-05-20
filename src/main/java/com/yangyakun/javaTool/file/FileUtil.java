package com.yangyakun.javaTool.file;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {

    private static List<String> preMessageIds = new ArrayList<>();
    public static void main(String[] args) {
        File file = new File("D://");
        if(file.isDirectory()){
            for (int i = 0; i < file.list().length; i++) {
                System.out.println(file.list()[i]);
            }
        }

        for (int i = 0; i < 10; i++) {
            if(preMessageIds.size()>=5){
                preMessageIds.remove(0);
            }
            preMessageIds.add("message"+i);
            System.out.println(preMessageIds.toString());
        }
    }
}
