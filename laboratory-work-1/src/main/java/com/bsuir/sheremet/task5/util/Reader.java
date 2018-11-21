package com.bsuir.sheremet.task5.util;

import java.util.Scanner;

public class Reader {

    private static Scanner scanner = new Scanner(System.in);

    public int[] readArrayFromConsole(int size) {
        int[] result = new int[size];

        for (int i = 0; i < size; i++) {
            result[i] = scanner.nextInt();
        }

        return result;
    }
}
