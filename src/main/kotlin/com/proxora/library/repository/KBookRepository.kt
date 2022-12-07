package com.proxora.library.repository

import java.time.LocalDate
import java.util.*

class KBookRepository {
    var data: List<KBook>? = null

    fun BookRepository() {

        data = Arrays.asList(
            KBook("1", "Clean Code", "Robert C. Martin", LocalDate.of(2008, 8, 1), 431),
            KBook("2", "The Clean Coder", "Robert C. Martin", LocalDate.of(2011, 5, 13), 377),
            KBook("3", "Clean Architecture", "Robert C. Martin", LocalDate.of(2017, 9, 20), 349),
            KBook("4", "Harry Potter - The Chamber of Secrets", "J. K. Rowling", LocalDate.of(1998, 7, 2), 431),
            KBook("5", "Harry Potter - The Goblet of Fire", "J. K. Rowling", LocalDate.of(2000, 7, 8), 565),
            KBook(
                "6",
                "The Lord of the Rings - The Fellowship of the Ring",
                "J. R. R. Tolkien",
                LocalDate.of(1954, 7, 29),
                543
            ),
            KBook("7", "The Lord of the Rings - The Two Towers", "J. R. R. Tolkien", LocalDate.of(1954, 11, 11), 511)
        )
    }
}