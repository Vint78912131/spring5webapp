/**
 * (c) Michael Lindvall
 *
 * @author mlindvall
 * BookController
 * 04 4/26/20, 2020
 */
package com.michaellindvall.spring5webapp.controllers;

import com.michaellindvall.spring5webapp.repositories.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author mlindvall
 */
@Controller
@RequiredArgsConstructor
public class BookController {

    private final BookRepository bookRepository;

    @RequestMapping("/books")
    public String getBooks(Model model) {
        model.addAttribute("books", bookRepository.findAll());
        return "books";
    }
}
