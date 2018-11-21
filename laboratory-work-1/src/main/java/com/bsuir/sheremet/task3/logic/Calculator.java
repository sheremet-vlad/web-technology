package com.bsuir.sheremet.task3.logic;

public class Calculator {
    public double[][] calculateTangent(Double lowerBound, Double higherBound, Double step) throws IllegalArgumentException {

        if (lowerBound >= higherBound) {
            throw new IllegalArgumentException("Lower bound is equal or less than higher bound");
        }

        int tableRowsCount = (int) ((higherBound - lowerBound) / step + 1);
        int tableColumnsCount = 2;

        double[][] newTable = new double[tableRowsCount][tableColumnsCount];

        int currentRow = 0;

        for (Double i = lowerBound; i <= higherBound; i += step) {
            newTable[currentRow][0] = i;
            newTable[currentRow][1] = Math.tan(i);

            currentRow++;
        }

        return newTable;
    }
}
