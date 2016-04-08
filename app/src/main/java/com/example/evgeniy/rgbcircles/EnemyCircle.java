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

    public EnemyCircle(int x, int y, int radius) {
        super(x, y, radius);
    }


    public static EnemyCircle getRandomCircle() {
        //получение случайных координат привязанных к размеру экрана
        Random random = new Random();
        int x = random.nextInt(GameManager.getWidth());
        int y = random.nextInt(GameManager.getHeight());
        int radius = 10 +random.nextInt(TO_RADIUS - FROM_RADIUS);
        EnemyCircle enemyCircle = new EnemyCircle(x,y,radius);
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
}
