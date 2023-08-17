package com.graphql.web;

import com.graphql.models.Author;
import com.graphql.models.Book;
import com.graphql.services.AuthorService;
import com.graphql.web.dto.AuthorDto;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import lombok.RequiredArgsConstructor;
import org.springframework.core.convert.ConversionService;

@Controller
@RequiredArgsConstructor
public class AuthorController {
    private final AuthorService authorService;
    private final ConversionService conversionService;

    @QueryMapping
    public AuthorDto authorById(@Argument Long id) {
        return conversionService.convert(authorService.findById(id), AuthorDto.class);
    }

    @QueryMapping
    public Author authorByName(@Argument String firstName) {
        return authorService.findByFirstName(firstName);

    }

    @MutationMapping
    public Author addAuthor(@Argument Long id, @Argument String firstName, @Argument String lastName)
    {
        Author author = new Author();
        author.setId(id);
        author.setFirstName(firstName);
        author.setLastName(lastName);
        return authorService.addAuthor(author);
    }
}