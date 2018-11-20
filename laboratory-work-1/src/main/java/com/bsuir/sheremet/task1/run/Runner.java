package com.bsuir.sheremet.task1.run;

import com.bsuir.sheremet.task1.logic.Calculator;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double x = in.nextDouble();
        double y = in.nextDouble();

        Calculator calculator = new Calculator();

        double result = calculator.calculateExpression(x, y);

        System.out.println(result);
    }
}
