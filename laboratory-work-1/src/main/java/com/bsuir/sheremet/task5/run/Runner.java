package com.bsuir.sheremet.task5.run;

import com.bsuir.sheremet.task5.logic.TableWorker;
import com.bsuir.sheremet.task5.util.Reader;

public class Runner {
    public static void main(String[] args) {
        Reader reader = new Reader();

        int[] array = reader.readArrayFromConsole(10);

        TableWorker worker = new TableWorker();
        int result = worker.findCountOfNumbersToLeaveIncreasingSequence(array);

        System.out.println(result);
    }
}
