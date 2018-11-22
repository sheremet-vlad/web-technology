package com.bsuir.sheremet.task16.logic;

import com.bsuir.sheremet.task15.entity.Book;

import java.util.Comparator;

public class TitleComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }
}
