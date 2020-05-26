package com.proxora.library.repository;

import java.time.LocalDate;

class Book {

    String id;
    String title;
    String author;
    LocalDate publicationDate;
    int numberOfPages;

    Book(String id, String title, String author, LocalDate publicationDate, int numberOfPages) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
        this.numberOfPages = numberOfPages;
    }
}
