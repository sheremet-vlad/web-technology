package com.bsuir.sheremet.task6.logic;

import org.junit.Assert;
import org.junit.Test;

public class MatrixCreatorTest {

    private final static MatrixCreator matrixCreator = new MatrixCreator();

    @Test
    public void shouldReturnCorrectMatrix() {
        double[] sourceArray = { 1.0, 2.0, 3.0 };
        double[][] actual = matrixCreator.create(sourceArray);

        double[][] expected = {
                { 1.0, 2.0, 3.0 },
                { 2.0, 3.0, 1.0 },
                { 3.0, 1.0, 2.0 }
        };

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnEmptyMatrixWhenArrayIsEmpty() {
        double[] sourceArray = { /* EMPTY */ };
        double[][] actual = matrixCreator.create(sourceArray);

        float[][] expected = { /* EMPTY */ };

        Assert.assertArrayEquals(expected, actual);
    }
}
