package com.bsuir.sheremet.task7.logic;

public class ShellSorter {

    public void sort(double[] sourceArray) {
        int i = 0;

        while (i < sourceArray.length - 1) {
            if (sourceArray[i] <= sourceArray[i + 1]) {
                i++;
            } else {
                swap(sourceArray, i, i + 1);

                if (i != 0) {
                    i--;
                }

            }
        }
    }


    private void swap(double[] sourceArray, int index1, int index2){
        double temp = sourceArray[index1];
        sourceArray[index1] = sourceArray[index2];
        sourceArray[index2] = temp;
    }
}
