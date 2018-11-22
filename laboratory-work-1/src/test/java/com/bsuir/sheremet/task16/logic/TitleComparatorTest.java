package com.bsuir.sheremet.task16.logic;

import com.bsuir.sheremet.task15.entity.Book;
import org.junit.Assert;
import org.junit.Test;

public class TitleComparatorTest {

    private final static TitleComparator comparator = new TitleComparator();

    @Test
    public void shouldReturnOneWhenFirstObjectTitleMoreThenSecond() {
        Book book = new Book("Java1", "Eckel", 190);
        Book anotherBook = new Book("Java", "Eckel", 180);

        int actual = comparator.compare(book, anotherBook);

        Assert.assertTrue(actual > 0);
    }

    @Test
    public void shouldReturnMinusOneWhenFirstObjectTitleMoreThenSecond() {
        Book book = new Book("Jav", "Eckel", 170);
        Book anotherBook = new Book("Java", "Eckel", 180);

        int actual = comparator.compare(book, anotherBook);

        Assert.assertTrue(actual < 0);
    }

    @Test
    public void shouldReturnZeroWhenFirstObjectTitleEqualsWithSecond() {
        Book book = new Book("Java", "Eckel", 190);
        Book anotherBook = new Book("Java", "Eckel", 180);

        int actual = comparator.compare(book, anotherBook);

        Assert.assertTrue(actual == 0);
    }
}
