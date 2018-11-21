package com.bsuir.sheremet.task4.run;

import com.bsuir.sheremet.task4.logic.ArrayChecker;
import com.bsuir.sheremet.task4.util.ArrayCreator;

import java.util.List;

public class Runner {

    public static void main(String[] args) {
        ArrayCreator arrayCreator = new ArrayCreator();
        int[] array = arrayCreator.createRandomArray(20,1,50);

        ArrayChecker arrayChecker = new ArrayChecker();
        List<Integer> indexesOfPrimeNumber = arrayChecker.getPrimeNumbers(array);

        System.out.println(indexesOfPrimeNumber);
    }
}
