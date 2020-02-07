/**
 * (c) Michael Lindvall
 *
 * @author mlindvall
 * BookRepository
 * 02 2/6/20, 2020
 */
package com.michaellindvall.spring5webapp.repositories;

import com.michaellindvall.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * @author mlindvall
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
