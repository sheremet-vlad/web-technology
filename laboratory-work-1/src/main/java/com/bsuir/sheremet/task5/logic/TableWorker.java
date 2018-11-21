package com.bsuir.sheremet.task5.logic;

public class TableWorker {

    public int findCountOfNumbersToLeaveIncreasingSequence(int[] sequence) {
        int[] subsequenceLengths = new int[sequence.length];

        for (int i = 0; i < sequence.length; i++) {
            subsequenceLengths[i] = 1;

            for (int j = 0; j < i; j++) {
                if (sequence[j] < sequence[i]) {
                    subsequenceLengths[i] = Math.max(subsequenceLengths[i], subsequenceLengths[j] + 1);
                }
            }
        }

        int maximumLength = 1;

        for (int i = 0; i < subsequenceLengths.length; i++) {
            maximumLength = Math.max(maximumLength, subsequenceLengths[i]);
        }

        return subsequenceLengths.length - maximumLength;
    }
}
