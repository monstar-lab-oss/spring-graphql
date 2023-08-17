package com.graphql.repositories;

import java.util.List;
import java.util.Optional;

import com.graphql.models.Author;
import com.graphql.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
	Optional<Book> findById(Long id);

	Optional<Book> findByName(String name);

	List<Book> findByAuthor(Author author);
}