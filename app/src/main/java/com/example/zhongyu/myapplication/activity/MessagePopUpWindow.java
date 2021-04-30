package com.example.zhongyu.myapplication.activity;

import android.content.Context;
import android.graphics.drawable.Icon;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.PopupWindow;

import com.example.zhongyu.myapplication.R;


public class MessagePopUpWindow extends PopupWindow {


    public MessagePopUpWindow(Context context) {
        this(context, null);
    }

    public MessagePopUpWindow(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MessagePopUpWindow(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setHeight(100);
        setWidth(200);
        setOutsideTouchable(true);
        setFocusable(true);
        View contentView = LayoutInflater.from(context).inflate(getLayout(),
                null, false);
        setContentView(contentView);
    }


    protected int getLayout() {
        return R.layout.message_pop_window;
    }

}
