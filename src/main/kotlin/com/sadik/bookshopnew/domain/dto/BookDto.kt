package com.sadik.bookshopnew.domain.dto

import jakarta.persistence.CascadeType
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.Table

data class BookDto(
    val isbn: String,

    val title: String,

    val description: String,

    val image: String,

    val authorDto: AuthorDto
)