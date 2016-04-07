package com.example.evgeniy.rgbcircles;

/**
 * Created by Evgeniy on 07.04.2016.
 */
public class MainCircle {

    public static final int INIT_RADIUS = 50;
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


}
