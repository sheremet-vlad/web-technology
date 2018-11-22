package com.bsuir.sheremet.task16.logic;

import com.bsuir.sheremet.task15.entity.Book;

import java.util.Comparator;

public class TitleAutherComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        int titleCompare = o1.getTitle().compareTo(o2.getTitle());

        if (titleCompare == 0) {
            return o1.getAuthor().compareTo(o2.getAuthor());
        }
        else {
            return titleCompare;
        }
    }
}
