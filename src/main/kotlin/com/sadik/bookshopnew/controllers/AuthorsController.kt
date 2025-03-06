package com.sadik.bookshopnew.controllers
import com.sadik.bookshopnew.domain.dto.AuthorDto
import com.sadik.bookshopnew.services.AuthorService
import com.sadik.bookshopnew.toAuthorDto
import com.sadik.bookshopnew.toAuthorEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class AuthorsController(private val authorService: AuthorService) {
    @PostMapping("/v1/authors")
    fun createAuthor(@RequestBody authorDto: AuthorDto): AuthorDto {
        return authorService.saveAuthor(
            authorDto.toAuthorEntity()
        ).toAuthorDto()
    }
}