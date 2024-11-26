package com.sushavi.learn.learngql.service.impl;

import com.sushavi.learn.learngql.entity.Book;
import com.sushavi.learn.learngql.repository.BookRepository;
import com.sushavi.learn.learngql.service.BookService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
@Slf4j
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    @Override
    public Book createBook(Book book) {
        log.info("Creating Book: {}", book);
        return bookRepository.save(book);
    }

    @Override
    public List<Book> getAllBooks() {
        log.info("Getting all Books");
        return bookRepository.findAll();
    }

    @Override
    public Book getBookById(int id) {
        log.info("Getting Book by Id: {}", id);
        return bookRepository.findById(id).orElse(null);
    }
}
