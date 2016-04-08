package com.example.evgeniy.rgbcircles;

import java.util.Random;

/**
 * Created by Evgeniy on 08.04.2016.
 */
public class EnemyCircle extends SimpleCircle {

    public static final int TO_RADIUS = 110;
    public static final int FROM_RADIUS = 10;

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
}
