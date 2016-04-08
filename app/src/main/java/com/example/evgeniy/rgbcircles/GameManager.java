package com.example.evgeniy.rgbcircles;

import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * Created by Evgeniy on 07.04.2016.
 */
public class GameManager {

    private MainCircle mainCircle;

    private CanvasView canvasView;
    private static int width;
    private static int height;

    public GameManager(CanvasView canvasView, int w, int h) {
        this.canvasView = canvasView;
        width = w;
        height = h;
        initMyCircle();
    }

    public static int getWidth() {
        return width;
    }

    public static int getHeight() {
        return height;
    }


    private void initMyCircle(){
        mainCircle = new MainCircle(width / 2, height / 2);
    }

    public void onDraw() {
        canvasView.drawCircle(mainCircle);
    }

    public void onTouchEvent(int x, int y) {
        mainCircle.moveMainCercleWhenTouchAt(x, y);
    }


}
