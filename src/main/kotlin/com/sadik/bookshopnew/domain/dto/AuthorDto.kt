package com.sadik.bookshopnew.domain.dto

import jakarta.persistence.*

data class AuthorDto(
    val id: Long?,

    val name: String,

    val age: Int,

    val description: String,

    val image: String
)