package com.graphql.repositories;

import com.graphql.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
	Optional<Author> findById(Long id);

	Optional<Author> findByFirstName(String firstName);
}