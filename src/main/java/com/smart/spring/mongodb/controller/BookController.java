package com.smart.spring.mongodb.controller;

import com.mongodb.client.MongoClients;
import com.smart.spring.mongodb.model.Book;
import com.smart.spring.mongodb.repository.BookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.data.mongodb.core.query.Criteria.where;

@RestController
@RequestMapping("/book")
@Slf4j
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

    @GetMapping("findBookByName/{name}")
    public Book getBookNamesOnly(@PathVariable("name") String name) throws Exception {
        MongoOperations mongoOperations = new MongoTemplate(MongoClients.create(), "BookStore");
        return mongoOperations.findOne(new Query(where("name").is(name)), Book.class);
    }


}
