package com.yangyakun.javaTool.pattern.observable;

import java.util.Observable;
import java.util.Observer;

public class Coder implements Observer {
    public String name;

    public Coder(String name) {
        this.name = name;
    }


    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Hi,"+name+",更新了"+arg);
    }

    @Override
    public String toString() {
        return "Coder{" +
                "name='" + name + '\'' +
                '}';
    }
}
