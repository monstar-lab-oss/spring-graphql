package com.graphql.services;

import com.graphql.models.Author;
import com.graphql.models.Book;
import com.graphql.repositories.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookService {
	private final BookRepository bookRepository;

	public Book findById(Long id) {
		return bookRepository.findById(id).get();
	}

	public List<Book> findAll() {
		return bookRepository.findAll();
	}

	public Book findByName(String name) {
		return bookRepository.findByName(name).get();
	}

	public Book addBook(Book book)
	{
		return bookRepository.save(book);
	}

	public List<Book> getBooksByAuthor(Author author)
	{
		return bookRepository.findByAuthor(author);
	}
}