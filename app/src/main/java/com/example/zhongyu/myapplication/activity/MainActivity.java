package com.example.zhongyu.myapplication.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.example.zhongyu.myapplication.R;

public class MainActivity extends Activity {

    private static final String TAG = "MainActivity";
    private RecyclerView mRecyclerview;
    private Button mXfermode;
    private Button mHook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mXfermode = findViewById(R.id.xfermode);
        mXfermode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XfermodeActivity.lauch(MainActivity.this, XfermodeActivity.class);
            }
        });
        mHook = (Button) findViewById(R.id.hook);
        mHook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HookActivity.lauch(MainActivity.this, HookActivity.class);
            }
        });
    }
}
