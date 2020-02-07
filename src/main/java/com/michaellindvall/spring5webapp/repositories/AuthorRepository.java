/**
 * (c) Michael Lindvall
 *
 * @author mlindvall
 * AuthorRepository
 * 02 2/6/20, 2020
 */
package com.michaellindvall.spring5webapp.repositories;

import com.michaellindvall.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * @author mlindvall
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
