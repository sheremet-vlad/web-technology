package com.bsuir.sheremet.task15.entity;

import org.junit.Assert;
import org.junit.Test;

public class BookTest {

    @Test
    public void shouldReturnOne() {
        Book book1 = new Book("1", "1", 25, 25);
        Book book2 = new Book("2", "2", 15, 15);

        int actual = book1.compareTo(book2);
        int expected = 1;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnZero() {
        Book book1 = new Book("1", "1", 25, 25);
        Book book2 = new Book("2", "2", 15, 25);

        int actual = book1.compareTo(book2);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnMinusOne() {
        Book book1 = new Book("1", "1", 25, 25);
        Book book2 = new Book("2", "2", 15, 35);

        int actual = book1.compareTo(book2);
        int expected = -1;

        Assert.assertEquals(expected, actual);
    }
}
