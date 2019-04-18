package com.yangyakun.javaTool.pattern.state.first;

import com.yangyakun.javaTool.pattern.state.first.impl.ClosingState;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(new ClosingState());

        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
