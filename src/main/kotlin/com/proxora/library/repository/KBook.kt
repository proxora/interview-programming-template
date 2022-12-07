package com.proxora.library.repository

import java.time.LocalDate

data class KBook(
    val id: String,
    val title: String,
    val author: String,
    val publicationDate: LocalDate,
    val numberOfPages: Int
)