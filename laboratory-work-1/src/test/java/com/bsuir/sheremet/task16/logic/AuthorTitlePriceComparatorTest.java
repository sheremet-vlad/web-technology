package com.bsuir.sheremet.task16.logic;

import com.bsuir.sheremet.task15.entity.Book;
import org.junit.Assert;
import org.junit.Test;

public class AuthorTitlePriceComparatorTest {

    private final static AuthorTitlePriceComparator comparator = new AuthorTitlePriceComparator();

    @Test
    public void shouldReturnOneWhenFirstObjectPriceMoreThenSecond() {
        Book book = new Book("Java", "Eckel", 190);
        Book anotherBook = new Book("Java", "Eckel", 180);

        int actual = comparator.compare(book, anotherBook);

        Assert.assertTrue(actual > 0);
    }

    @Test
    public void shouldReturnMinusOneWhenFirstObjectPriceLessThenSecond() {
        Book book = new Book("Java", "Eckel", 170);
        Book anotherBook = new Book("Java", "Eckel", 180);

        int actual = comparator.compare(book, anotherBook);

        Assert.assertTrue(actual < 0);
    }

    @Test
    public void shouldReturnZeroWhenAllFieldsEquals() {
        Book book = new Book("Java", "Eckel", 190);
        Book anotherBook = new Book("Java", "Eckel", 190);

        int actual = comparator.compare(book, anotherBook);

        Assert.assertTrue(actual == 0);
    }
}
