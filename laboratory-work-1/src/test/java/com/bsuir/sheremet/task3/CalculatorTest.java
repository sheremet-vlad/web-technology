package com.bsuir.sheremet.task3;

import com.bsuir.sheremet.task3.calculate.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    private final static Calculator calculator = new Calculator();

    @Test
    public void testColumnOneInReturnedTableFromCalculateTangent() {
        double[][] actualTable = calculator.calculateTangent(0.0, Math.PI / 3, Math.PI / 6);
        double[] actualArguments = { actualTable[0][0], actualTable[1][0], actualTable[2][0] };
        double[] expected = { 0.0, 0.52, 1.05 };


        Assert.assertArrayEquals(expected, actualArguments, 0.01);
    }

    @Test
    public void testColumnTwoInReturnedTableFromCalculateTangent() {
        double[][] actualTable = calculator.calculateTangent(0.0, Math.PI / 3, Math.PI / 6);
        double[] actualArguments = { actualTable[0][1], actualTable[1][1], actualTable[2][1] };
        double[] expected = { 0.0, 0.58, 1.73 };

        Assert.assertArrayEquals(expected, actualArguments, 0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldReturnExceptionWhenArgumentEqualZero() {
        calculator.calculateTangent(1.0,0.0,0.2);
    }
}
