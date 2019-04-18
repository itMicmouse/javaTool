package com.yangyakun.javaTool.pattern.state.first;

import com.yangyakun.javaTool.pattern.state.first.impl.ClosingState;
import com.yangyakun.javaTool.pattern.state.first.impl.OpenningState;
import com.yangyakun.javaTool.pattern.state.first.impl.RunningState;
import com.yangyakun.javaTool.pattern.state.first.impl.StoppingState;

public class Context {
    public static final OpenningState openningState = new OpenningState();
    public static final ClosingState closingState = new ClosingState();
    public static final RunningState runningState = new RunningState();
    public static final StoppingState stoppingState = new StoppingState();

    /**
     * 定义当前电梯的状态
     */
    private LiftState liftState;

    public LiftState getLiftState() {
        return liftState;
    }

    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        //把当前的环境通知到各个实现类中
        this.liftState.setContext(this);
    }

    public void open() {
        this.liftState.open();
    }

    public void close() {
        this.liftState.close();
    }

    public void run() {
        this.liftState.run();
    }

    public void stop() {
        this.liftState.stop();
    }

}
