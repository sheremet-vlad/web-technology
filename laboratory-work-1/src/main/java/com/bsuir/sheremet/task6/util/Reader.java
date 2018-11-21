package com.bsuir.sheremet.task6.util;

import java.util.Scanner;

public class Reader {
    private static Scanner scanner = new Scanner(System.in);

    public double[] readArrayFromConsole(int size) {
        double[] result = new double[size];

        for (int i = 0; i < size; i++) {
            result[i] = scanner.nextDouble();
        }

        return result;
    }
}
