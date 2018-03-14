package com.example.zhongyu.myapplication.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by zhongyu on 3/14/2018.
 */

public class LinearGradlent extends View {
    public LinearGradlent(Context context) {
        super(context);
    }

    public LinearGradlent(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public LinearGradlent(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Shader shader = new LinearGradient(100, 100, 500, 500,
                Color.parseColor("#E91E63"),
                Color.parseColor("#2196F3"), Shader.TileMode.CLAMP);
        Paint paint = new Paint();
        paint.setShader(shader);
        canvas.drawCircle(300, 300, 200, paint);
    }
}





















