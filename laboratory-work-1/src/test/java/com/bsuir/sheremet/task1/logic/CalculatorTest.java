package com.bsuir.sheremet.task1.logic;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    private final static double X = 4;
    private final static double Y = 2;
    private final static double DELTA = 0.1;

    private Calculator calculator = new Calculator();

    @Test
    public void shouldReturnDoubleNumber() {
        double expected = 2.1;
        double actual = calculator.calculateExpression(X, Y);
        Assert.assertEquals(expected, actual, DELTA);
    }
}
