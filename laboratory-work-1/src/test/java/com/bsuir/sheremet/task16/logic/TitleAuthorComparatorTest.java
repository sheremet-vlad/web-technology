package com.bsuir.sheremet.task16.logic;

import com.bsuir.sheremet.task15.entity.Book;
import org.junit.Assert;
import org.junit.Test;

public class TitleAuthorComparatorTest {

    private final static TitleAutherComparator comparator = new TitleAutherComparator();

    @Test
    public void shouldReturnOneWhenFirstObjectTitleMoreThenSecond() {
        Book book = new Book("Java1", "Eckel", 190);
        Book anotherBook = new Book("Java", "Eckel", 180);

        int actual = comparator.compare(book, anotherBook);

        Assert.assertTrue(actual > 0);
    }

    @Test
    public void shouldReturnMinusOneWhenFirstObjectTitleLessThenSecond() {
        Book book = new Book("Jav", "Eckel", 190);
        Book anotherBook = new Book("Java", "Eckel", 180);

        int actual = comparator.compare(book, anotherBook);

        Assert.assertTrue(actual < 0);
    }

    @Test
    public void shouldReturnZeroWhenFirstObjectTitleAndAuthorEquals() {
        Book book = new Book("Java", "Eckel", 190);
        Book anotherBook = new Book("Java", "Eckel", 180);

        int actual = comparator.compare(book, anotherBook);

        Assert.assertTrue(actual == 0);
    }
}
