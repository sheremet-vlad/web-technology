package com.bsuir.sheremet.task4.logic;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayCheckerTest {

    private final static ArrayChecker arrayChecker = new ArrayChecker();

    @Test
    public void ShouldReturnIndexesWhenArrayContainPrimeNumbers() {
        // act
        int[] sourceArray = { -7, 2, 3, 1, 0, -12, 9, 8, 10 };
        ArrayList<Integer> actual = arrayChecker.getPrimeNumbers(sourceArray);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList( 2, 3 ));

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void ShouldReturnEmptyListWhenArrayIsEmpty() {
        int[] sourceArray = { /* EMPTY! */  };
        ArrayList<Integer> actual = arrayChecker.getPrimeNumbers(sourceArray);
        ArrayList<Integer> expected = new ArrayList<>(/* EMPTY! */);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkArrayWithNegativeNumbersShouldReturnEmptyList() {
        int[] sourceArray = { -7, -2, -3, -10  };
        ArrayList<Integer> actual = arrayChecker.getPrimeNumbers(sourceArray);
        ArrayList<Integer> expected = new ArrayList<>(/* EMPTY! */);

        Assert.assertEquals(expected, actual);
    }
}
