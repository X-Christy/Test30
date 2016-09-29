package cn.edu.bistu.cs.se.test30;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by lenovo on 2016/9/9.
 */
public class CustomView extends View {

    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawColor(Color.WHITE);

        Paint paint = new Paint();

        paint.setAntiAlias(true);

        paint.setColor(Color.GRAY);

        paint.setStyle(Paint.Style.STROKE);

        paint.setStrokeWidth(10);

        canvas.drawRect(400, 400, 600, 600, paint);

        Path path = new Path();
        path.moveTo(100, 120);
        path.lineTo(300, 120);
        path.lineTo(100, 200);
        path.close();
        paint.setStyle(Paint.Style.FILL);
        canvas.drawPath(path, paint);

        paint.setTextSize(20);
        paint.setColor(Color.GRAY);
        paint.setStrikeThruText(true);
        canvas.drawText("Christy", 100, 500, paint);

        Path pathText = new Path();
        pathText.addCircle(200,300,80, Path.Direction.CCW);

        canvas.drawTextOnPath("这  是  一  个  圆  圈 ... 这  是  一  个  圆  圈 ... 这  是  一  个  圆  圈",pathText,0,15,paint);
    }

}