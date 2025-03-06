package com.sadik.bookshopnew.services

import com.sadik.bookshopnew.domain.entity.AuthorEntity

interface AuthorService {
    fun saveAuthor(author: AuthorEntity):AuthorEntity
}