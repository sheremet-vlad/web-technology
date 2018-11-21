package com.bsuir.sheremet.task5.logic;

import org.junit.Assert;
import org.junit.Test;

public class TableWorkerTest {

    private final static TableWorker worker = new TableWorker();

    @Test
    public void shouldReturnCorrectAnswer() {

        int actual = worker.findCountOfNumbersToLeaveIncreasingSequence(new int[] { 1, 2, 10, 4 , 5 });
        int expected = 1;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnZeroWhenArrayIsAscending() {

        int actual = worker.findCountOfNumbersToLeaveIncreasingSequence(new int[] { 1, 2, 3, 4 , 5 });
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldRerurnMinusOneWhenArrayIsEmpty() {

        int actual = worker.findCountOfNumbersToLeaveIncreasingSequence(new int[] {});
        int expected = -1;

        Assert.assertEquals(expected, actual);
    }
}
