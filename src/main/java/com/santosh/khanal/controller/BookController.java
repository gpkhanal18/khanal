package com.santosh.khanal.controller;

import com.santosh.khanal.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {

    @GetMapping("/health")
    public String healthCheck(){
        return "application is running fine";
    }

    @GetMapping("/books")
    public List<Book> getBooks(){
        Book book1 = new Book();
        book1.setTitle("title1");
        book1.setId(1);

        Book book2 = new Book();
        book2.setTitle("title1");
        book2.setId(1);

        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        return books;
    }
}
