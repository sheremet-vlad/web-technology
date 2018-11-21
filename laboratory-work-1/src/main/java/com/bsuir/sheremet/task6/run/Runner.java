package com.bsuir.sheremet.task6.run;

import com.bsuir.sheremet.task6.logic.MatrixCreator;
import com.bsuir.sheremet.task6.util.Reader;

public class Runner {
    public static void main(String[] args) {
        Reader reader = new Reader();
        double[] arr = reader.readArrayFromConsole(5);

        MatrixCreator matrixCreator = new MatrixCreator();
        double[][] result = matrixCreator.create(arr);

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                System.out.print(result[i][j] + " ");
            }

            System.out.println();
        }
    }
}
