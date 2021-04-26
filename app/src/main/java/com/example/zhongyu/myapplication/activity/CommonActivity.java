package com.example.zhongyu.myapplication.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

/**
 * Copyright (c) 2021 Tencent. All rights reserved.
 * 类描述
 *
 * @author microli
 * @date 2021/4/26 18:31
 */
public class CommonActivity extends Activity {

    public static  <T extends Class> void lauch(Context context, T t) {
        Intent intent = new Intent(context, t);
        context.startActivity(intent);
    }
}
