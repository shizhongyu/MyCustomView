package com.example.zhongyu.myapplication.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.zhongyu.myapplication.R;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pinChart(View view) {
        int x = (int) (350 * Math.sin(Math.toRadians(30)));
        int y = (int) (350 * Math.cos(Math.toRadians(30)));
        Toast.makeText(this, "pinchart" + y, Toast.LENGTH_SHORT).show();
    }
}
