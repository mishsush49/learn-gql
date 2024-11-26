package com.sushavi.learn.learngql.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "project_book")
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String author;
    private String title;
    private String description;
}
