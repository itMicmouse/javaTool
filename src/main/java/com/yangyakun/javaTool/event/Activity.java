package com.yangyakun.javaTool.event;

import com.yangyakun.javaTool.event.listener.OnTouchListener;

public class Activity {
    public static void main(String[] args) {

        ViewGroup viewGroup = new ViewGroup(0, 0, 1080, 1920);
        viewGroup.setName("顶层容器");
        ViewGroup viewGroup1 = new ViewGroup(0, 0, 500, 500);
        viewGroup.setName("第二层容器");

        View view = new View(0, 0, 200, 200);

        viewGroup1.addView(view);

        viewGroup.addView(viewGroup1);



        viewGroup.setOnTouchListener(new OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvnet event) {
                System.out.println("顶层容器的OnTouch事件");
                return false;
            }
        });
        viewGroup1.setOnTouchListener(new OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvnet event) {
                System.out.println("第二层容器的OnTouch事件");
                return false;
            }
        });

        view.setOnTouchListener(new OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvnet event) {
                System.out.println("view的OnTouch事件");
                return true;
            }
        });





        MotionEvnet motionEvnet = new MotionEvnet(100, 100);
        motionEvnet.setActionMasked(MotionEvnet.ACTION_DOWN);


        viewGroup.dispathTouchEvent(motionEvnet);
    }
}
