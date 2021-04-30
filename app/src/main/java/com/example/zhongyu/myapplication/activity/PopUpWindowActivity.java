package com.example.zhongyu.myapplication.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

import com.example.zhongyu.myapplication.R;

public class PopUpWindowActivity extends CommonActivity {


    private Button mDelete;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popupwindow);
        initView();
    }

    private void initView() {
        mDelete = (Button) findViewById(R.id.delete);
        mDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MessagePopUpWindow messagePopUpWindow = new MessagePopUpWindow(mDelete.getContext());
                messagePopUpWindow.showAsDropDown(mDelete);

            }
        });
    }
}
