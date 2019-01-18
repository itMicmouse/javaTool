package com.yangyakun.javaTool.pattern.observable;

import java.util.Observable;

public class DevTechFrontier extends Observable {
    public void postNetPublic(String context){
        setChanged();
        notifyObservers(context);
    }
}
