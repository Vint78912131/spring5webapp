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
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NonNull
    @EqualsAndHashCode.Exclude
    private String title;

    @NonNull
    @EqualsAndHashCode.Exclude
    private String isbn;

    @ManyToMany
    @JoinTable(name = "author_book", joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "author_id"))
    @EqualsAndHashCode.Exclude
    private Set<Author> authors = new HashSet<>();

    @OneToOne
    @NonNull
    @EqualsAndHashCode.Exclude
    private Publisher publisher;
}
