package com.bsuir.sheremet.task9.logic;

import com.bsuir.sheremet.task9.entity.Basket;
import com.bsuir.sheremet.task9.util.BasketCreator;
import org.junit.Assert;
import org.junit.Test;

import java.awt.*;
import java.util.ArrayList;

public class BasketWorkerTest {

    private final static BasketWorker basketWorker = new BasketWorker();
    private final static BasketCreator basketCreeator = new BasketCreator();

    @Test
    public void shouldReturnWeight() {
        Basket basket = basketCreeator.createBasket();

        int actual = basketWorker.calculateBallsWeightInBasket(basket);
        int expected = 2000;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnCountOfBlueBallsInBasket() {
        Basket basket = basketCreeator.createBasket();

        int actual = basketWorker.calculateBallsWithThisColor(basket, Color.BLUE);
        int expeected = 3;

        Assert.assertEquals(expeected, actual);
    }

    @Test
    public void shouldReturnZeroWhenThereAreNoBallsWithThisColorInBasket() {
        Basket basket = basketCreeator.createBasket();

        int actual = basketWorker.calculateBallsWithThisColor(basket, Color.YELLOW);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnZeroBallsWithThisColorWhenBasketIsEmpty() {
        Basket basket = new Basket(new ArrayList<>());

        int actual = basketWorker.calculateBallsWithThisColor(basket, Color.YELLOW);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnZeroWeightWhenBasketIsEmpty() {
        Basket basket = new Basket(new ArrayList<>());

        int actual = basketWorker.calculateBallsWithThisColor(basket, Color.YELLOW);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }
}
