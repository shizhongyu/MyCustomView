package com.example.zhongyu.myapplication.activity;

import android.app.Activity;
import android.content.Intent;

public class BaseActivity extends Activity {

    protected void goTo(Class clazz) {
        Intent intent = new Intent(this, clazz);
        startActivity(intent);
    }

}
