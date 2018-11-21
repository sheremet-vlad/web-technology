package com.bsuir.sheremet.task6.logic;

public class MatrixCreator {

    private double[] cyclicShiftArrayLeft(double[] sourceArray) {
        double[] result = new double[sourceArray.length];

        double temp = sourceArray[0];

        for (int i = 0; i < result.length - 1; i++) {
            result[i] = sourceArray[i + 1];
        }

        result[result.length - 1] = temp;

        return result;
    }

    public double[][] create(double[] sourceArray) {
        int length = sourceArray.length;
        double[] srcCopy = sourceArray.clone();

        double[][] result = new double[length][length];

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                result[i][j] = srcCopy[j];
            }

            srcCopy = cyclicShiftArrayLeft(srcCopy);
        }

        return result;
    }
}
