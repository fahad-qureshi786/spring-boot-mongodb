package com.smart.spring.mongodb.controller;

import com.smart.spring.mongodb.model.Book;
import com.smart.spring.mongodb.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/getAll")
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @PostMapping("addBook")
    public Book add(@RequestBody Book book) {
        return bookRepository.save(book);
    }

    @GetMapping("findById/{id}")
    public Book add(@PathVariable("id") Long id) throws Exception {
        return bookRepository.findById(id).orElseThrow(() -> new Exception("Book not found for id=" + id));
    }


}
