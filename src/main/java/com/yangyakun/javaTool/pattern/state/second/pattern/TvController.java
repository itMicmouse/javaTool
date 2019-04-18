package com.yangyakun.javaTool.pattern.state.second.pattern;

public class TvController implements PowerController{

    private TvState mTvState;

    public void setmTvState(TvState mTvState) {
        this.mTvState = mTvState;
    }

    @Override
    public void powerOn() {
        setmTvState(new PowerOnState());
        System.out.println("开机啦");
    }

    @Override
    public void powerOff() {
        setmTvState(new PowerOffState());
        System.out.println("正式关机");
    }

    public void nextChannel(){
        mTvState.nextChannel();
    }

    public void preChannel(){
        mTvState.preChannel();
    }

    public void turnUp(){
        mTvState.turnUp();
    }

    public void turnDown(){
        mTvState.turnDown();
    }
}
