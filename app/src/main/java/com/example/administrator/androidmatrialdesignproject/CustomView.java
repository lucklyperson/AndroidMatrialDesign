package com.example.administrator.androidmatrialdesignproject;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;


/**
 * Created by $wu on 2017-08-31 下午 4:49.
 */

public class CustomView extends ImageView {
    private int lastX;
    private int lastY;

    public CustomView(Context context) {
        this(context, null);
    }

    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        //获取屏幕的位置 x和y
        int tempX = (int) event.getRawX();
        int tempY = (int) event.getRawY();
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                break;
            case MotionEvent.ACTION_MOVE:
                int deltaX = tempX - lastX;
                int deltaY = tempY - lastY;
                int translationX = (int) (getTranslationX() + deltaX);
                int translationY = (int) (getTranslationY() + deltaY);
                setTranslationX(translationX);
                setTranslationY(translationY);
                break;
            case MotionEvent.ACTION_UP:
                break;
            default:
                break;
        }

        lastX = tempX;
        lastY = tempY;
        return true;

    }
}
