package com.graphql.models;

import java.util.Arrays;
import java.util.List;
import lombok.*;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.ManyToOne;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
@Builder
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "books")
public class Book {
//    (
//}Long id, String name, int pageCount, Long authorId) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int pageCount;

    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Author author;
//    private static List<Book> books = Arrays.asList(
//            new Book("book-1", "Effective Java", 416, "author-1"),
//            new Book("book-2", "Hitchhiker's Guide to the Galaxy", 208, "author-2"),
//            new Book("book-3", "Down Under", 436, "author-3"),
//            new Book("book-4", "Up On", 200, "author-3")
//    );


}