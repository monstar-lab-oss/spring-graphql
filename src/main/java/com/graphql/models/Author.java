package com.graphql.models;

import java.util.Arrays;
import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
@ToString(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@Table(name = "authors")
public class Author {
//    (
//}Long id, String firstName, String lastName, List<Book> books) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;

//    private static List<Author> authors = Arrays.asList(
//            new Author("author-1", "Joshua", "Bloch", Arrays.asList( Book.getById("book-1"))),
//            new Author("author-2", "Douglas", "Adams", Arrays.asList( Book.getById("book-2"))),
//            new Author("author-3", "Bill", "Bryson", Arrays.asList( Book.getById("book-3"), Book.getById("book-4")))
//    );
}