package com.yangyakun.javaTool.pattern.state.second.pattern;

public class PowerOffState implements TvState {

    @Override
    public void nextChannel() {
        print();
    }

    @Override
    public void preChannel() {
        print();
    }

    @Override
    public void turnUp() {
        print();
    }

    @Override
    public void turnDown() {
        print();
    }

    private void print(){
        System.out.println("两个红灯提示没有开机");
    }
}
