package com.example.demo.interview;

import java.time.LocalDate;

class Book {

    String id;
    String title;
    String author;
    LocalDate releaseDate;

    Book(String id, String title, String author, LocalDate releaseDate) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
    }
}
