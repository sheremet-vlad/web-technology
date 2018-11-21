package com.bsuir.sheremet.task4.logic;

import java.util.ArrayList;

public class ArrayChecker {

    public ArrayList<Integer> getPrimeNumbers(int[] sourceArray) {
        ArrayList<Integer> indexes = new ArrayList<>();

        for (int i = 0; i < sourceArray.length; i++) {
            if (isPrime(sourceArray[i])) {
                indexes.add(sourceArray[i]);
            }
        }

        return indexes;
    }

    private static boolean isPrime(int sourceNumber) {
        if (sourceNumber < 2) {
            return false;
        }

        double numberSqrt = Math.sqrt(sourceNumber);
        for (int i = 2; i <= numberSqrt; i++) {
            if (sourceNumber % i == 0) {
                return false;
            }
        }

        return true;
    }
}
