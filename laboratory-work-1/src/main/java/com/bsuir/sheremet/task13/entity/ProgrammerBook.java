package com.bsuir.sheremet.task13.entity;

import com.bsuir.sheremet.task12.entity.Book;

import java.util.Objects;

public class ProgrammerBook extends Book {
    private String language;
    private int level;

    public String getLanguage() {
        return language;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        if (!super.equals(object)) {
            return false;
        }

        ProgrammerBook programmerBook = (ProgrammerBook) object;
        return level == programmerBook.level &&
                Objects.equals(language, programmerBook.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), language, level);
    }

    @Override
    public String toString() {
        return super.toString() +
                "language='" + language + '\'' +
                ", level=" + level;
    }
}
