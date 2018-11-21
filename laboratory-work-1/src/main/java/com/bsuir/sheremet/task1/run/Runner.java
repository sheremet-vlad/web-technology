package com.bsuir.sheremet.task1.run;

import com.bsuir.sheremet.task1.logic.Calculator;
import com.bsuir.sheremet.task1.util.Reader;

public class Runner {
    public static void main(String[] args) {
        Reader reader = new Reader();

        double x = reader.readDoubleNumber();
        double y = reader.readDoubleNumber();

        Calculator calculator = new Calculator();

        double result = calculator.calculateExpression(x, y);

        System.out.println(result);
    }
}
