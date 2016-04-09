package com.example.evgeniy.rgbcircles;

import android.graphics.Color;

/**
 * Created by Evgeniy on 07.04.2016.
 */
public class MainCircle extends SimpleCircle{

    public static final int INIT_RADIUS = 50;
    public static final int MAIN_SPEED = 50;
    public static final int OUR_COLOR = Color.BLUE;

    public MainCircle(int x, int y) {
        super(x, y, INIT_RADIUS);
        setColor(OUR_COLOR);
    }


    public void moveMainCercleWhenTouchAt(int x1, int y1) {
        int dx = (x1-x) * MAIN_SPEED /GameManager.getWidth();
        int dy = (y1-y) * MAIN_SPEED / GameManager.getHeight();

        x += dx;
        y += dy;
    }

    public void initRadius() {
        radius = INIT_RADIUS;
    }

    public void growRadius(SimpleCircle circle) {
        //метод увеличивает площадь главного кргуа на площадь съеденного круга
        radius = (int) Math.sqrt(Math.pow(radius,2)+ Math.pow(circle.radius,2));
    }
}