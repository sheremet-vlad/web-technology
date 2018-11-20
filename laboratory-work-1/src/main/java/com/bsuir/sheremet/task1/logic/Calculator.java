package com.bsuir.sheremet.task1.logic;

public class Calculator {

    public double calculateExpression(double x, double y) throws IllegalArgumentException {
        return (1 + Math.pow(Math.sin(x + y), 2))
                / (2 + Math.abs(x - (2 * x) / (1 + x * x * y * y))) + 2;
    }
}
