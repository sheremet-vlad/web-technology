package com.bsuir.sheremet.task8.run;

import com.bsuir.sheremet.task8.logic.ArrayConcat;
import com.bsuir.sheremet.task8.util.Reader;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        Reader reader = new Reader();
        double[] arrayA = reader.readArray(5);
        double[] arrayB = reader.readArray(5);

        ArrayConcat arrayConcat = new ArrayConcat();

        int[] indexes = arrayConcat.findIndexesToConcatWithSavingSorting(arrayA, arrayB);

        Arrays.stream(indexes).forEach(System.out::println);
    }
}
