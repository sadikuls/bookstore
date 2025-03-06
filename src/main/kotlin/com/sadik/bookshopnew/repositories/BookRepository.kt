package com.sadik.bookshopnew.repositories

import com.sadik.bookshopnew.domain.entity.BookEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface BookRepository: JpaRepository<BookEntity, String>