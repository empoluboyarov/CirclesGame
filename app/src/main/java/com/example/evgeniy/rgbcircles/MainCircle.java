package com.example.evgeniy.rgbcircles;

/**
 * Created by Evgeniy on 07.04.2016.
 */
public class MainCircle {

    public static final int INIT_RADIUS = 50;
    public static final int MAIN_SPEED = 50;
    private int x;
    private int y;
    private int radius;

    public MainCircle(int x, int y) {
        this.x = x;
        this.y = y;
        radius = INIT_RADIUS;
    }

    public int getRadius() {
        return radius;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    public void moveMainCercleWhenTouchAt(int x1, int y1) {
        int dx = (x1-x) * MAIN_SPEED /GameManager.getWidth();
        int dy = (y1-y) * MAIN_SPEED / GameManager.getHeight();

        x += dx;
        y += dy;
    }
}