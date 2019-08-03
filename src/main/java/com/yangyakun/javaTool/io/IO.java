package com.yangyakun.javaTool.io;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

public class IO {
    public static void main(String[] args) {
        nio1();
    }

    private static void io1() {
        try(OutputStream outputStream = new FileOutputStream("./26.txt")) {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
//            outputStream.write('q');
//            outputStream.write('b');
            bufferedOutputStream.write('a');
            bufferedOutputStream.write('b');
            bufferedOutputStream.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void io3(){
        try(InputStream inputStream = new FileInputStream("./26.txt");
            OutputStream outputStream = new FileOutputStream("./27.txt")
        ) {
            byte[] data = new byte[1024];
            int read;
            while ((read = inputStream.read(data))!=-1){
                outputStream.write(data,0,read);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void nio1(){
        try(RandomAccessFile file = new RandomAccessFile("./26.txt","r");) {
            FileChannel fileChannel = file.getChannel();
            ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
            fileChannel.read(byteBuffer);
            byteBuffer.flip();
            System.out.println(Charset.defaultCharset().decode(byteBuffer));
            byteBuffer.clear();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void okio1(){

    }
}
