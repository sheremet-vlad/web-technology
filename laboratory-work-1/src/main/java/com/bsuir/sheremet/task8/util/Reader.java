package com.bsuir.sheremet.task8.util;

import java.util.Scanner;

public class Reader {
    private static Scanner scanner = new Scanner(System.in);

    public double[] readArray(int size) {
        double[] array = new double[size];

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextDouble();
        }

        return array;
    }
}
