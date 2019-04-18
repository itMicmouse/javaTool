package com.yangyakun.javaTool.pattern.state.second.pattern;

public class Client {
    public static void main(String[] args) {
        TvController tvController = new TvController();
        tvController.powerOn();
        tvController.nextChannel();
        tvController.turnUp();
        tvController.powerOff();
        tvController.turnDown();
    }
}
