/**
 * (c) Michael Lindvall
 *
 * @author mlindvall
 * PublisherRepository
 * 02 2/6/20, 2020
 */
package com.michaellindvall.spring5webapp.repositories;

import com.michaellindvall.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * @author mlindvall
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
