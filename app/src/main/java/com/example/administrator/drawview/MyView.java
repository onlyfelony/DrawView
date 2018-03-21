package com.example.administrator.drawview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by Administrator on 2018/3/20 0020.
 */
public class MyView extends View {
    //定义并创建画笔
   private Paint paint;
    float cx = 50;
    float cy = 50;
    public MyView(Context context, AttributeSet attrs){
        super(context,attrs);
        paint = new Paint();
    }

    //    @Override
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //设置画笔的颜色
        paint.setColor(Color.RED);
        //绘制一个小圆
        canvas.drawCircle(cx,cy,15,paint);
    }
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        cx = event.getX();
        cy = event.getY();
        //通知当前组件重绘自己
        invalidate();
    // return super.onTouchEvent(event);
      return  true;
    }
}
