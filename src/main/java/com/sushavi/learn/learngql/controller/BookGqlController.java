package com.sushavi.learn.learngql.controller;

import com.sushavi.learn.learngql.data.BookInput;
import com.sushavi.learn.learngql.entity.Book;
import com.sushavi.learn.learngql.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class BookGqlController{
    private final BookService bookService;

    // Create Book with rest endpoint /createBook
    @MutationMapping("createBook")
    public Book createBook(@Argument BookInput bookInput) {
        Book book = new Book();
        book.setTitle(bookInput.getTitle());
        book.setAuthor(bookInput.getAuthor());
        book.setName(bookInput.getName());
        book.setDescription(bookInput.getDescription());
        return bookService.createBook(book);
    }

    @QueryMapping("getAllBooks")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @QueryMapping("getBookById")
    public Book getBookById(@Argument int id) {
        return bookService.getBookById(id);
    }
}
