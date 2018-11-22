package com.bsuir.sheremet.task9.util;

import com.bsuir.sheremet.task9.entity.Ball;
import com.bsuir.sheremet.task9.entity.Basket;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class BasketCreator {

    public Basket createBasket() {
        List<Ball> balls = new ArrayList<>();

        balls.add(new Ball(200, Color.blue));
        balls.add(new Ball(300, Color.blue));
        balls.add(new Ball(100, Color.blue));
        balls.add(new Ball(400, Color.red));
        balls.add(new Ball(1000, Color.black));

        return new Basket(balls);
    }

}
