package com.graphql.web;

import com.graphql.models.Author;
import com.graphql.models.Book;
import com.graphql.services.AuthorService;
import com.graphql.services.BookService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import lombok.RequiredArgsConstructor;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class BookController {
    private final AuthorService authorService;
    private final BookService bookService;

    @QueryMapping
    public Book bookById(@Argument Long id) {
        return bookService.findById(id);
    }

    @QueryMapping
    public List<Book> allBooks() {
        return bookService.findAll();
    }

    @SchemaMapping
    public Author author(Book book) {
        return authorService.findById(book.getAuthor().getId());
    }

    @QueryMapping
    public Book bookByName(@Argument String name) {
        return bookService.findByName(name);
    }

    @MutationMapping
    public Book addBook(@Argument Long id, @Argument String name, @Argument int pageCount, @Argument Long authorId)
    {
        Book book = new Book();
        book.setId(id);
        book.setName(name);
        book.setPageCount(pageCount);
        book.setAuthor(authorService.findById(authorId));
        return bookService.addBook(book);
    }
}