/**
 * (c) Michael Lindvall
 *
 * @author mlindvall
 * Book
 * 02 2/5/20, 2020
 */
package com.michaellindvall.spring5webapp.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author mlindvall
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@EqualsAndHashCode(exclude = {"title", "isbn", "publisher", "authors"})
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NonNull
    private String title;
    @NonNull
    private String isbn;
    @NonNull
    private String publisher;

    @ManyToMany
    @JoinTable(name = "author_book", joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "author_id"))
    private Set<Author> authors = new HashSet<>();
}
