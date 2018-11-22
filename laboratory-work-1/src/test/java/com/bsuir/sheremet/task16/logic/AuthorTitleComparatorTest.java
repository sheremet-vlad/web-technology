package com.bsuir.sheremet.task16.logic;

import com.bsuir.sheremet.task15.entity.Book;
import org.junit.Assert;
import org.junit.Test;

public class AuthorTitleComparatorTest {

    private final static AuthorTitleComparator comparator = new AuthorTitleComparator();

    @Test
    public void shouldReturnMinusOne() {
        Book book = new Book("Thinking In Java", "Eckel", 100);
        Book anotherBook = new Book("Java", "Schildt", 180);

        int actual = comparator.compare(book, anotherBook);

        Assert.assertTrue(actual < 0);
    }

    @Test
    public void shouldReturnOne() {
        Book book = new Book("Thinking In Java", "Eckel", 100);
        Book anotherBook = new Book("Java Core", "Cornell", 180);

        int actual = comparator.compare(book, anotherBook);

        Assert.assertTrue(actual > 0);
    }

    @Test
    public void shouldReturnMinusOneWhenAuthorEqualsButTitleOfObjectOneLess() {
        Book book = new Book("Algorithms in Java", "Sedgewick", 100);
        Book anotherBook = new Book("Computer Science", "Sedgewick", 180);

        int actual = comparator.compare(book, anotherBook);

        Assert.assertTrue(actual < 0);
    }

    @Test
    public void shouldReturnZeroWhenAuthorAndTitleEquals() {
        Book book = new Book("Algorithms in Java", "Sedgewick", 100);
        Book anotherBook = new Book("Algorithms in Java", "Sedgewick", 100);

        int actual = comparator.compare(book, anotherBook);

        Assert.assertTrue(actual == 0);
    }
}
