package com.yangyakun.javaTool.pattern.state.first.impl;

import com.yangyakun.javaTool.pattern.state.first.Context;
import com.yangyakun.javaTool.pattern.state.first.LiftState;

/**
 * 停止状态
 */
public class StoppingState extends LiftState {
    @Override
    public void open() {
        super.context.setLiftState(Context.openningState);
        super.context.getLiftState().open();
    }

    @Override
    public void close() {
        //已经是关闭状态了
    }

    @Override
    public void run() {
        super.context.setLiftState(Context.runningState);
        super.context.getLiftState().run();
    }

    /**
     * 停止状态怎么发生的？当然是停止方法执行了
     */
    @Override
    public void stop() {
        System.out.println("电梯停止……");
    }
}
