package com.yangyakun.javaTool.pattern.state.first;


public abstract class LiftState {
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    /**
     * 首先电梯门开启动作
     */
    public abstract void open();

    /**
     * 电梯门 关闭动作
     */
    public abstract void close();

    /**
     * 电梯上下运行
     */
    public abstract void run();

    /**
     * 电梯停止运行
     */
    public abstract void stop();
}
