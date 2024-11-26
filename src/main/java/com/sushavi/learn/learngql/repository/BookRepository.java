package com.sushavi.learn.learngql.repository;

import com.sushavi.learn.learngql.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
