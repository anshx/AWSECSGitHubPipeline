package com.example.awsecsdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class BookController {

    @GetMapping("/books")
    public String getBooks() {
        return "New Book";
    }
    
    @GetMapping("/show")
    public String showBooks() {
        return "Show Book";
    }

}
