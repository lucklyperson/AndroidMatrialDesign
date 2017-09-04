package com.example.administrator.androidmatrialdesignproject;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by $wu on 2017-08-31 下午 4:38.
 */

public class MyBehavior extends CoordinatorLayout.Behavior<Button> {
    private int width;

    public MyBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
        DisplayMetrics display = context.getResources().getDisplayMetrics();
        width = display.widthPixels;
    }


    @Override
    public boolean layoutDependsOn(CoordinatorLayout parent, Button child, View dependency) {
        Log.e("1111", "depends=" + (dependency instanceof CustomView));
        return dependency instanceof CustomView;
    }

    @Override
    public boolean onDependentViewChanged(CoordinatorLayout parent, Button child, View dependency) {
        //根据dependency的位置,设置button的位置


        int top = dependency.getTop();
        int left = dependency.getLeft();
        int x = width - left - child.getWidth();
        int y = top;

        Log.e("222", "x = " + top + ",y=" + left);
        setPosition(child, x, y);

        return true;
    }

    private void setPosition(View v, int x, int y) {
        CoordinatorLayout.MarginLayoutParams params = (CoordinatorLayout.MarginLayoutParams) v.getLayoutParams();
        params.leftMargin = x;
        params.topMargin = y;
        v.setLayoutParams(params);
    }

}
