package com.yangyakun.javaTool.event.listener;

import com.yangyakun.javaTool.event.MotionEvnet;
import com.yangyakun.javaTool.event.View;

public interface OnTouchListener {
    boolean onTouch(View view, MotionEvnet event);
}
