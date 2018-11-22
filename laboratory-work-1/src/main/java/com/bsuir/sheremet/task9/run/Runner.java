package com.bsuir.sheremet.task9.run;

import com.bsuir.sheremet.task9.entity.Basket;
import com.bsuir.sheremet.task9.logic.BasketWorker;
import com.bsuir.sheremet.task9.util.BasketCreator;

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
