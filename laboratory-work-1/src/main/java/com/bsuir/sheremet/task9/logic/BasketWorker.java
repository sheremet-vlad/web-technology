package com.bsuir.sheremet.task9.logic;

import com.bsuir.sheremet.task9.entity.Ball;
import com.bsuir.sheremet.task9.entity.Basket;

import java.awt.*;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class BasketWorker {

    public int calculateBallsWeightInBasket(Basket basket) {
        List<Ball> balls = basket.getBalls();

        AtomicInteger sumWeight = new AtomicInteger();
        balls.forEach(p -> sumWeight.addAndGet(p.getWeight()));

        return sumWeight.get();
    }

    public int calculateBallsWithThisColor(Basket basket, Color color) {
        List<Ball> balls = basket.getBalls();

        return (int)balls.stream()
                        .filter(p -> p.getColor() == color)
                        .count();
    }
}
