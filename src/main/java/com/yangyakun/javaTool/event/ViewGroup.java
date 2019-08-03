package com.yangyakun.javaTool.event;

import java.util.ArrayList;
import java.util.List;

public class ViewGroup extends View {

    public ViewGroup(int left, int top, int right, int bottom) {
        super(left, top, right, bottom);
    }

    List<View> childList = new ArrayList<>();

    private View[] mChildren = new View[0];

    public void addView(View view){
        if(view==null){
            return;
        }
        childList.add(view);
        mChildren = childList.toArray(new View[childList.size()]);
    }

    private TouchTarget mFirstTouchTarget;
    //事件分发入口
    public boolean dispathTouchEvent(MotionEvnet ev){

        boolean intercepted = onInterceptTouchEvent(ev);

        TouchTarget newTouchTarget = null;

        int actionMasked = ev.getActionMasked();

        boolean handled = false;

        if(actionMasked != MotionEvnet.getActionCancel() && !intercepted){
            if(actionMasked == MotionEvnet.ACTION_DOWN){
                View[] children = this.mChildren;
                for (int i = children.length-1; i >=0 ; i--) {
                    View child = mChildren[i];
                    if(!child.isContainer(ev.getX(),ev.getY())){
                        continue;
                    }
                    if(dispathTransformedTouchEvent(ev,child)){
                        handled = true;
                        newTouchTarget = addTouchTarget(child);
                        break;
                    }
                }
            }
            //
            if(mFirstTouchTarget==null){
                handled =  dispathTransformedTouchEvent(ev,null);
            }
        }

        return handled;
    }

    private TouchTarget addTouchTarget(View child) {
        final TouchTarget obtain = TouchTarget.obtain(child);

        obtain.next = mFirstTouchTarget;

        mFirstTouchTarget = obtain;

        return obtain;
    }

    private static final class TouchTarget{
        public View child;

        //回收池（一个对象）
        private static TouchTarget sRecycleBin;
        private static final Object sRecycleLock = new Object[0];

        public TouchTarget next;
        private static int sRecycleCount;

        public static TouchTarget obtain(View child){
            TouchTarget target;
            synchronized (sRecycleLock){
                if(sRecycleBin==null){
                    target = new TouchTarget();
                }else {
                    target = sRecycleBin;
                }
                sRecycleBin = target.next;
                sRecycleCount--;
                target.next = null;
            }
            target.child = child;
            return target;
        }
    }
    //分发处理
    private boolean dispathTransformedTouchEvent(MotionEvnet ev, View child) {
        boolean handled = false;
        if(child!=null) {
            handled = child.dispathTouchEvent(ev);
        }else {
            handled = super.dispathTouchEvent(ev);
        }
        return handled;
    }

    public boolean onInterceptTouchEvent(MotionEvnet ev){
        return false;
    }
}
