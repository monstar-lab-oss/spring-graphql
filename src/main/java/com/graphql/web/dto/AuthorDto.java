package com.graphql.web.dto;

import com.graphql.models.Book;

import java.util.List;

public record AuthorDto(Long id,
                         String firstName,
                         String lastName,
                         List<Book> books) {}
