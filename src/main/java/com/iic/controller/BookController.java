package com.iic.controller;

import com.iic.core.Book;
import com.iic.repository.IBookRepository;
import lombok.RequiredArgsConstructor;
import org.fluentd.logger.FluentLogger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
public class BookController {
    private final IBookRepository bookRepository;
    private final FluentLogger fluentLogger;

    @GetMapping
    List<Book> getAll() {
        var books = bookRepository.getAll();
        books.forEach(book -> fluentLogger.log("books", Map.of(book.getId().toString(), book.getTitle())));
        return books;
    }
}
