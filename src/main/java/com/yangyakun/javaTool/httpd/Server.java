package com.yangyakun.javaTool.httpd;

import java.io.IOException;

public class Server {
    public static void main(String[] args) {
        CallNumberServer myServer = new CallNumberServer(8080);
        try {
            myServer.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
