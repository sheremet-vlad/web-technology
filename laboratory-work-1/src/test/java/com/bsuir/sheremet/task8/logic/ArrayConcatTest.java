package com.bsuir.sheremet.task8.logic;

import org.junit.Assert;
import org.junit.Test;

public class ArrayConcatTest {

    private final static ArrayConcat arrayConcat = new ArrayConcat();

    @Test
    public void shouldReturnIndexes() {
        double[] arrayA = {2.0, 4.0, 6.0};
        double[] arrayB = {1.0, 3.0, 5.0};

        int[] actual = arrayConcat.findIndexesToConcatWithSavingSorting(arrayA, arrayB);

        int[] expected = {0,2,4};

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnEmptyArrayWhenArgsIsEmpty() {
        double[] arrayA = { /* EMPTY! */ };
        double[] arrayB = { /* EMPTY! */ };

        int[] actual = arrayConcat.findIndexesToConcatWithSavingSorting(arrayA, arrayB);

        int[] expected = { /* EMPTY! */ };

        Assert.assertArrayEquals(expected, actual);
    }
}
