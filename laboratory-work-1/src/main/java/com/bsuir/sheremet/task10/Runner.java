package com.bsuir.sheremet.task10;

import java.awt.*;

public class Runner {
    public static void main(String[] args) {
        BasketCreator basketCreator = new BasketCreator();
        Basket basket = basketCreator.createBasket();

        BasketWorker basketWorker = new BasketWorker();

        System.out.println(basketWorker.calculateBallsWeightInBasket(basket));
        System.out.println(basketWorker.calculateBallsWithThisColor(basket, Color.blue));
    }
}
