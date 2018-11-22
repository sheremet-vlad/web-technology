package com.bsuir.sheremet.task8.logic;

public class ArrayConcat {
    
    public int[] findIndexesToConcatWithSavingSorting(double[] sequence1, double[] sequence2) {
        int[] indexes = new int[sequence2.length];

        double[] mergedArray = new double[sequence1.length + sequence2.length];

        int i = 0;
        int j = 0;
        int k = 0;
        int n = 0;

        while ((i < sequence1.length) && (j < sequence2.length)) {
            if (sequence1[i] < sequence2[j]) {
                mergedArray[k++] = sequence1[i++];
            } else {
                mergedArray[k] = sequence2[j++];
                indexes[n++] = k++;
            }
        }

        if (i < sequence1.length) {
            while (i < sequence1.length) {
                mergedArray[k++] = sequence1[i++];
            }
        } else {
            while (j < sequence2.length) {
                mergedArray[k] = sequence2[j++];
                indexes[n++] = k++;
            }
        }

        return indexes;
    }
}
