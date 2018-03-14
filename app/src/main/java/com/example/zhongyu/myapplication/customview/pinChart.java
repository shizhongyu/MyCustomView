package com.example.zhongyu.myapplication.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by zhongyu on 3/14/2018.
 */

public class pinChart extends View {
    public pinChart(Context context) {
        super(context);
    }

    public pinChart(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public pinChart(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();
        paint.setColor(Color.parseColor("#ffc107"));
        canvas.drawArc(100, 100, 800, 800, -70, 70, true, paint);
        float yStart = 450 -  (float) ((350 * Math.sin(Math.toRadians(35))));
        float xStart = (float) (450 +  (350 * Math.cos(Math.toRadians(35))));
        float yEnd = (float) (450 - 400 * Math.sin(Math.toRadians(35)));
        float xEnd = (float) (450 + 400 * Math.cos(Math.toRadians(35)));
        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(5);
        paint.setStyle(Paint.Style.STROKE);
        Path path = new Path();
        path.moveTo(xStart, yStart);
        path.lineTo(xEnd, yEnd);
        path.rLineTo(50, 0);
        canvas.drawPath(path, paint);
        paint.setTextSize(50);
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(1);
        canvas.drawText("java", xEnd + 60, yEnd, paint);
        paint.setColor(Color.parseColor("#9c27b0"));
        canvas.drawArc(100, 100, 800, 800, 0, 30, true, paint);
        paint.setColor(Color.parseColor("#009688"));
        canvas.drawArc(100, 100, 800, 800, 30, 150, true, paint);
        paint.setColor(Color.RED);
        canvas.drawArc(80, 80, 780, 780, 180, 110, true, paint);
    }
}
