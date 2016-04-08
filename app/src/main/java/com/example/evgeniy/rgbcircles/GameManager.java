package com.example.evgeniy.rgbcircles;

import android.graphics.Canvas;
import android.graphics.Paint;

import java.util.ArrayList;

/**
 * Created by Evgeniy on 07.04.2016.
 */
public class GameManager {

    public static final int MAX_CIRCLES = 10; // кол-во вражеских кругов
    private MainCircle mainCircle;
    private ArrayList<EnemyCircle> circles;
    private CanvasView canvasView;
    private static int width;
    private static int height;

    public GameManager(CanvasView canvasView, int w, int h) {
        this.canvasView = canvasView;
        width = w;
        height = h;
        initMyCircle();
        initEnemyCircles();
    }

    private void initEnemyCircles() {
        circles = new ArrayList<EnemyCircle>();
        for (int i = 0; i < MAX_CIRCLES; i++){
            EnemyCircle circle;
            circle = EnemyCircle.getRandomCircle();
            circles.add(circle);
        }
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
        for (EnemyCircle circle: circles){
            canvasView.drawCircle(circle);
        }
    }

    public void onTouchEvent(int x, int y) {
        mainCircle.moveMainCercleWhenTouchAt(x, y);
    }


}
