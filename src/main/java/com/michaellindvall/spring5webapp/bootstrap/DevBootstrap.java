/**
 * (c) Michael Lindvall
 *
 * @author mlindvall
 * DevBootstrap
 * 02 2/6/20, 2020
 */
package com.michaellindvall.spring5webapp.bootstrap;

import com.michaellindvall.spring5webapp.model.Author;
import com.michaellindvall.spring5webapp.model.Book;
import com.michaellindvall.spring5webapp.model.Publisher;
import com.michaellindvall.spring5webapp.repositories.AuthorRepository;
import com.michaellindvall.spring5webapp.repositories.BookRepository;
import com.michaellindvall.spring5webapp.repositories.PublisherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;


/**
 * @author mlindvall
 */
@Component
@RequiredArgsConstructor
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;
    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {

        Publisher publisher = new Publisher();
        publisher.setName("foo");
        publisherRepository.save(publisher);

        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "1234", publisher);
        eric.getBooks().add(ddd);
        authorRepository.save(eric);
        bookRepository.save(ddd);

        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "23444", publisher);
        rod.getBooks().add(noEJB);
        authorRepository.save(rod);
        bookRepository.save(noEJB);

    }

}
