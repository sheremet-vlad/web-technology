package com.bsuir.sheremet.task3.run;

import com.bsuir.sheremet.task3.calculate.Calculator;
import com.bsuir.sheremet.task3.util.Reader;

public class Runner {
    public static void main(String[] args) {
        Reader reader = new Reader();

        double lowerBound = reader.readDoubleNumber();
        double higherBound = reader.readDoubleNumber();
        double step = reader.readDoubleNumber();

        Calculator calculator = new Calculator();
        double[][] resultTable = calculator.calculateTangent(lowerBound, higherBound, step);

        for (int i = 0; i < resultTable.length; i++) {
            for (int j = 0; j < resultTable[i].length; j++) {
                System.out.print(resultTable[i][j] + " ");
            }
            System.out.println();
        }
    }
}
