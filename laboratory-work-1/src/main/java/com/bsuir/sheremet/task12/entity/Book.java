package com.bsuir.sheremet.task12.entity;

import java.util.Objects;

public class Book implements Cloneable {
    private String title;
    private String author;
    private int price;
    private static int edition;

    public Book(){
    }

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public static int getEdition() {
        return edition;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Book book = (Book) object;
        return price == book.price &&
                Objects.equals(title, book.title) &&
                Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, price);
    }

    @Override
    public String toString() {
        return this.getClass() +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price;
    }


    @Override
    public Object clone() throws CloneNotSupportedException {
        Book book = (Book)super.clone();

        if (this.author != null) {
            book.author = this.author;
        }
        if (this.title != null) {
            book.title = this.title;
        }
        book.price = this.price;

        return book;
    }

}
