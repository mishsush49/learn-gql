package com.sushavi.learn.learngql.service;

import com.sushavi.learn.learngql.data.BookInput;
import com.sushavi.learn.learngql.entity.Book;

import java.util.List;

public interface BookService {
    // Create Book
    public Book createBook(Book book);

    // get All Books
    public List<Book> getAllBooks();

    // get Book by Id
    public Book getBookById(int id);
}
