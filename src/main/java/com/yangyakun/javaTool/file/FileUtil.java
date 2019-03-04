package com.yangyakun.javaTool.file;

import java.io.File;

public class FileUtil {
    public static void main(String[] args) {
        File file = new File("D://");
        if(file.isDirectory()){
            for (int i = 0; i < file.list().length; i++) {
                System.out.println(file.list()[i]);
            }
        }
    }
}
