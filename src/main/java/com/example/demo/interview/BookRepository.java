package com.example.demo.interview;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

class BookRepository {
    List<Book> data;

    BookRepository() {
        this.data = Arrays.asList(
                new Book("1", "Cean Code", "Robert C. Martin", LocalDate.of(2008, 8, 1), 431),
                new Book("2", "The Clean Coder", "Robert C. Martin", LocalDate.of(2011, 5, 13), 377),
                new Book("3", "Clean Architecture", "Robert C. Martin", LocalDate.of(2017, 9, 20), 349),
                new Book("4", "Harry Potter - The Chamber of Secrets", "J. K. Rowling", LocalDate.of(1998, 7, 2), 431),
                new Book("5", "Harry Potter - The Goblet of Fire", "J. K. Rowling", LocalDate.of(2000, 7, 8), 565),
                new Book("6", "The Lord of the Rings - The Fellowship of the Ring", "J. R. R. Tolkien", LocalDate.of(1954, 7, 29), 543),
                new Book("7", "The Lord of the Rings - The Two Towers", "J. R. R. Tolkien", LocalDate.of(1954, 11, 11), 511));
    }

}