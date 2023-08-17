package com.graphql.services;

import com.graphql.models.Author;
import com.graphql.models.Book;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.stereotype.Service;
import com.graphql.repositories.AuthorRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthorService {
	private final AuthorRepository authorRepository;

	public Author findById(Long id) {
		return authorRepository.findById(id).get();
	}

	public Author findByFirstName(String firstName) {
		return authorRepository.findByFirstName(firstName).get();
	}

	public Author addAuthor(Author author)
	{
		return authorRepository.save(author);
	}
}