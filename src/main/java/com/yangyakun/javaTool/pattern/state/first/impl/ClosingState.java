package com.yangyakun.javaTool.pattern.state.first.impl;

import com.yangyakun.javaTool.pattern.state.first.Context;
import com.yangyakun.javaTool.pattern.state.first.LiftState;

public class ClosingState extends LiftState {
    @Override
    public void open() {
        super.context.setLiftState(Context.openningState);
        super.context.getLiftState().open();
    }

    @Override
    public void close() {
        System.out.println("电梯门关闭……");
    }

    @Override
    public void run() {
        System.out.println("电梯上下运行……");
    }

    @Override
    public void stop() {
        super.context.setLiftState(Context.stoppingState);
        super.context.getLiftState().stop();
    }
}
