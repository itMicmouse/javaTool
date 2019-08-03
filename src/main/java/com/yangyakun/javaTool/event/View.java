package com.yangyakun.javaTool.event;

import com.yangyakun.javaTool.event.listener.OnClickListener;
import com.yangyakun.javaTool.event.listener.OnTouchListener;

public class View {
    private int left;
    private int top;
    private int right;
    private int bottom;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private OnTouchListener onTouchListener;
    private OnClickListener onClickListener;

    public View() {
    }

    public View(int left, int top, int right, int bottom) {
        this.left = left;
        this.top = top;
        this.right = right;
        this.bottom = bottom;
    }

    public boolean isContainer(int x,int y){
        if(x>left&&x<right&&y<bottom&&y>top){
            return true;
        }
        return false;
    }
    //接受分发的代码
    public boolean dispathTouchEvent(MotionEvnet evnet){
        //消费
        boolean result = false;
        if(onTouchListener!=null && onTouchListener.onTouch(this,evnet)){
            return true;
        }
        if(!result && onTouchEvent(evnet)){
            result = true;
        }
        return result;
    }

    private boolean onTouchEvent(MotionEvnet evnet) {
        if(onClickListener !=null){
            onClickListener.onClick(this);
            return true;
        }
        return false;
    }

    public OnTouchListener getOnTouchListener() {
        return onTouchListener;
    }

    public void setOnTouchListener(OnTouchListener onTouchListener) {
        this.onTouchListener = onTouchListener;
    }

    public OnClickListener getOnClickListener() {
        return onClickListener;
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }
}
