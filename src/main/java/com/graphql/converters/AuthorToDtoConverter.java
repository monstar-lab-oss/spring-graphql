package com.graphql.converters;

import com.graphql.models.Author;
import com.graphql.models.Book;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import com.graphql.web.dto.AuthorDto;
import java.util.List;
import com.graphql.services.BookService;
import lombok.*;


@Component
@RequiredArgsConstructor
public class AuthorToDtoConverter
    implements Converter<Author, AuthorDto> {

  private final BookService bookService;
  @Override
  public AuthorDto convert(Author source) {
    List<Book> books = bookService.getBooksByAuthor(source);
    return new AuthorDto(source.getId(),
        source.getFirstName(),
        source.getLastName(),
        books);
  }
}