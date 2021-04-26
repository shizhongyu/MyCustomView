package com.example.zhongyu.myapplication.activity;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.example.zhongyu.myapplication.R;

/**
 * Copyright (c) 2021 Tencent. All rights reserved.
 * 类描述
 *
 * @author microli
 * @date 2021/4/26 18:36
 */
public class XfermodeActivity extends CommonActivity {

    private ImageView mImageView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xfermode);
        initView();
    }

    private void initView() {
        mImageView = (ImageView) findViewById(R.id.image_view);
        mImageView.setColorFilter(Color.parseColor("#1AFF0000"), PorterDuff.Mode.SRC_ATOP);
    }
}
