package com.bsuir.sheremet;

import com.bsuir.sheremet.task1.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class task1Test {

    private final static double X = 4;
    private final static double Y = 2;
    private final static double ILLEGAL_X = 0;
    private final static double DELTA = 0.1;

    private Calculator calculator = new Calculator();

    @Test
    public void shouldReturnDoubleNumber() {
        double expected = 2.1;
        double actual = calculator.calculateExpression(X, Y);
        Assert.assertEquals(expected, actual, DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldReturnExceptionWhenArgumentEqualZero() {
        calculator.calculateExpression(ILLEGAL_X, Y);
    }
}
