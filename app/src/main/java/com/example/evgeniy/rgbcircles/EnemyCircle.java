package com.example.evgeniy.rgbcircles;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by Evgeniy on 08.04.2016.
 */
public class EnemyCircle extends SimpleCircle {

    public static final int TO_RADIUS = 110;
    public static final int FROM_RADIUS = 10;
    public static final int ENEMY_COLOR = Color.RED;
    public static final int FOOD_COLOR = Color.rgb(0, 200, 0);
    public static final int RANDOM_SPEED = 10;
    private int dx;
    private int dy;

    public EnemyCircle(int x, int y, int radius, int dx, int dy) {
        super(x, y, radius);
        this.dx = dx;
        this.dy = dy;
    }


    public static EnemyCircle getRandomCircle() {
        //получение случайных координат привязанных к размеру экрана
        Random random = new Random();
        int x = random.nextInt(GameManager.getWidth());
        int y = random.nextInt(GameManager.getHeight());
        int dx = 1+ random.nextInt(RANDOM_SPEED);
        int dy = 1+ random.nextInt(RANDOM_SPEED);
        int radius = 10 +random.nextInt(TO_RADIUS - FROM_RADIUS);
        EnemyCircle enemyCircle = new EnemyCircle(x,y,radius, dx, dy);
        return enemyCircle;
    }


    public void setEnemyOrFoodColor(MainCircle mainCircle) {
        if (isSmallerThen(mainCircle)){
            setColor(FOOD_COLOR);
        } else setColor(ENEMY_COLOR);
    }

    private boolean isSmallerThen(SimpleCircle simpleCircle) {
        if (radius < simpleCircle.radius)
            return true;
        else return false;
    }

    public void moveOneStep() {
        x+=dx;
        y+=dy;
    }
}
