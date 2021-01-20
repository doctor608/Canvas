package com.example.hous;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

public class MyView extends View {

    public MyView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {

        Paint paint = new Paint();
        paint.setColor(Color.parseColor("#81d4fa"));
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect(0,0,1600,3100, paint);

        paint.setColor(Color.parseColor("#4e342e"));
        canvas.drawRect(0,1830,1440, 2960, paint);

        paint.setColor(Color.parseColor("#ffff00"));
        canvas.drawCircle(1500, 0, 200, paint);

        paint.setColor(Color.parseColor("#3e2723"));
        canvas.drawRect(100,900, 1000, 2300, paint);

        paint.setColor(Color.parseColor("#ff3d00"));
        Path path = new Path();
        path.moveTo(100,900);
        path.lineTo(550,700);
        path.lineTo(1000,900);
        canvas.drawPath(path,paint);

        paint.setColor(Color.parseColor("#2962ff"));

        //int j = 0;
        /*
        for (j = 0; j < 15; ++j){
            int x0 = 0;
            int y0 = 2200;
            int x1 = 100;
            int y1 = 2400;

            canvas.drawRect(x0, y0, x1, y1, paint);
            path.moveTo(x0,y0);
            path.lineTo((x0 + x1)/2, y0 - 100);
            path.lineTo(x1,y0);
            canvas.drawPath(path,paint);

            x0 = x0 + x1;
            x1 = x1 + 100;
        }
        doesnt work((
         */


        canvas.drawRect(0, 2200, 100, 2400, paint);
        path.moveTo(000,2200);
        path.lineTo(50,2100);
        path.lineTo(100,2200);
        canvas.drawPath(path,paint);

        canvas.drawRect(100, 2200, 200, 2400, paint);
        path.moveTo(100,2200);
        path.lineTo(150,2100);
        path.lineTo(200,2200);
        canvas.drawPath(path,paint);

        canvas.drawRect(200, 2200, 300, 2400, paint);
        path.moveTo(200,2200);
        path.lineTo(250,2100);
        path.lineTo(300,2200);

        canvas.drawRect(300, 2200, 400, 2400, paint);
        path.moveTo(300,2200);
        path.lineTo(350,2100);
        path.lineTo(400,2200);

        canvas.drawRect(400, 2200, 500, 2400, paint);
        path.moveTo(400,2200);
        path.lineTo(450,2100);
        path.lineTo(500,2200);

        canvas.drawRect(500, 2200, 600, 2400, paint);
        path.moveTo(500,2200);
        path.lineTo(550,2100);
        path.lineTo(600,2200);

        canvas.drawRect(600, 2200, 700, 2400, paint);
        path.moveTo(600,2200);
        path.lineTo(650,2100);
        path.lineTo(700,2200);

        canvas.drawRect(700, 2200, 800, 2400, paint);
        path.moveTo(700,2200);
        path.lineTo(750,2100);
        path.lineTo(800,2200);

        canvas.drawRect(800, 2200, 900, 2400, paint);
        path.moveTo(800,2200);
        path.lineTo(850,2100);
        path.lineTo(900,2200);

        canvas.drawRect(900, 2200, 1000, 2400, paint);
        path.moveTo(900,2200);
        path.lineTo(950,2100);
        path.lineTo(1000,2200);

        canvas.drawRect(1000, 2200, 1100, 2400, paint);
        path.moveTo(1000,2200);
        path.lineTo(1050,2100);
        path.lineTo(1100,2200);

        canvas.drawRect(1100, 2200, 1200, 2400, paint);
        path.moveTo(1100,2200);
        path.lineTo(1150,2100);
        path.lineTo(1200,2200);

        canvas.drawRect(1200, 2200, 1300, 2400, paint);
        path.moveTo(1200,2200);
        path.lineTo(1250,2100);
        path.lineTo(1300,2200);

        canvas.drawRect(1300, 2200, 1400, 2400, paint);
        path.moveTo(1300,2200);
        path.lineTo(1350,2100);
        path.lineTo(1400,2200);

        canvas.drawRect(1400, 2200, 1500, 2400, paint);
        path.moveTo(1400,2200);
        path.lineTo(1450,2100);
        path.lineTo(1500,2200);

        canvas.drawPath(path,paint);

        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.parseColor("#f4f4f4"));

        //paint.setColor(Color.parseColor("#3e2723"));
        //canvas.drawRect(100,900, 1000, 2300, paint);
        canvas.drawRect(400,1400,700,1800, paint);

        paint.setColor(Color.parseColor("#304ffe"));
        canvas.drawRect(410,1410, 690,1790, paint);
        paint.setColor(Color.WHITE);
        canvas.drawPath(path, paint);

        paint.setColor(Color.BLACK);
        paint.setTextSize(50);
        canvas.drawText("HOUS",475, 800, paint);



    }


}
