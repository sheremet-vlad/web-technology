package com.bsuir.sheremet.task16.logic;

import com.bsuir.sheremet.task15.entity.Book;

import java.util.Comparator;

public class AuthorTitlePriceComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        int authorCompare = o1.getAuthor().compareTo(o2.getAuthor());

        if (authorCompare != 0) {
            return authorCompare;
        }

        int titleCompare = o1.getTitle().compareTo(o2.getTitle());

        if (titleCompare != 0) {
            return titleCompare;
        }

        return Integer.compare(o1.getPrice(), o2.getPrice());
    }
}
