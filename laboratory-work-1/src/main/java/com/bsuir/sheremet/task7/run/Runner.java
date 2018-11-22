package com.bsuir.sheremet.task7.run;

import com.bsuir.sheremet.task7.logic.ShellSorter;
import com.bsuir.sheremet.task7.util.Reader;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        Reader reader = new Reader();
        double[] array = reader.readArray(4);

        ShellSorter shellSorter = new ShellSorter();
        shellSorter.sort(array);

        Arrays.stream(array).forEach(System.out::println);
    }
}
