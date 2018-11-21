package com.bsuir.sheremet.task4.util;

import java.util.Random;

public class ArrayCreator {

    public int[] createRandomArray(int size, int lowerBound, int higherBound) {
        int[] array = new int[size];

        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(higherBound - lowerBound) + lowerBound;
        }

        return array;
    }
}
