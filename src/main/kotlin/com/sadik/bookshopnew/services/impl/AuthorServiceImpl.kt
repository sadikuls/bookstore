package com.sadik.bookshopnew.services.impl

import com.sadik.bookshopnew.domain.entity.AuthorEntity
import com.sadik.bookshopnew.repositories.AuthorRepository
import com.sadik.bookshopnew.services.AuthorService
import org.springframework.stereotype.Service

@Service
class AuthorServiceImpl(private val authorRepository: AuthorRepository): AuthorService {
    override fun saveAuthor(author: AuthorEntity): AuthorEntity {
        return authorRepository.save(author)
    }
}