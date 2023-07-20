package com.graphql;

import java.util.Arrays;
import java.util.List;

public record Author (String id, String firstName, String lastName, List<Book> books) {

    private static List<Author> authors = Arrays.asList(
            new Author("author-1", "Joshua", "Bloch", Arrays.asList( Book.getById("book-1"))),
            new Author("author-2", "Douglas", "Adams", Arrays.asList( Book.getById("book-2"))),
            new Author("author-3", "Bill", "Bryson", Arrays.asList( Book.getById("book-3"), Book.getById("book-4")))
    );

    public static Author getById(String id) {
        return authors.stream()
				.filter(author -> author.id().equals(id))
				.findFirst()
				.orElse(null);
    }
}