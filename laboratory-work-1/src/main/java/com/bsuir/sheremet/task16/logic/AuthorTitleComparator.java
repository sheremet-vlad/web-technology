package com.bsuir.sheremet.task16.logic;

import com.bsuir.sheremet.task15.entity.Book;

import java.util.Comparator;

public class AuthorTitleComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        int authorCompare = o1.getAuthor().compareTo(o2.getAuthor());

        if (authorCompare == 0) {
            return o1.getTitle().compareTo(o2.getTitle());
        }
        else {
            return authorCompare;
        }
    }
}
