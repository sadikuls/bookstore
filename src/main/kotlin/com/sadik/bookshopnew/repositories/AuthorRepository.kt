package com.sadik.bookshopnew.repositories

import com.sadik.bookshopnew.domain.entity.AuthorEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AuthorRepository: JpaRepository<AuthorEntity, Long>