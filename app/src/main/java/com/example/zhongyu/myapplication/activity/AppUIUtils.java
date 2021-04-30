package com.example.zhongyu.myapplication.activity;

import android.content.Context;

public class AppUIUtils {

    public static int dip2px(float dipValue, Context context) {
        float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dipValue * scale + 0.5F);
    }
}
