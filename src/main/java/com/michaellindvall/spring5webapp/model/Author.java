/**
 * (c) Michael Lindvall
 *
 * @author mlindvall
 * Author
 * 02 2/5/20, 2020
 */
package com.michaellindvall.spring5webapp.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

/**
 * @author mlindvall
 */
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(exclude = {"firstName", "lastName", "books"})
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NonNull
    private String firstName;
    @NonNull
    private String lastName;

    @ManyToMany(mappedBy = "authors")
    private Set<Book> books = new HashSet<>();

}
