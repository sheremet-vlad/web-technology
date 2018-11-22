package com.bsuir.sheremet.task7.logic;

import org.junit.Assert;
import org.junit.Test;

public class ShellSortTest {

    private final static ShellSorter shellSorter = new ShellSorter();

    @Test
    public void shouldSortArray() {
        double[] actual = {1.0 , 4.0, 2.0, 3.0};
        shellSorter.sort(actual);

        double[] expected = {1.0, 2.0, 3.0, 4.0};

        Assert.assertArrayEquals(expected, actual, 0.01);
    }

    @Test
    public void shouldNotChangeArrayWhenArrayAlreadySorted() {
        double[] actual = {1.0, 2.0, 3.0, 4.0};
        shellSorter.sort(actual);

        double[] expected = {1.0, 2.0, 3.0, 4.0};

        Assert.assertArrayEquals(expected, actual, 0.01);
    }
}
