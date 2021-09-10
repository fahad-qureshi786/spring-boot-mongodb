package com.smart.spring.mongodb.repository;

import com.smart.spring.mongodb.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface BookRepository extends MongoRepository<Book, Long> {

    @Query("select book.name from Book as book")
    public List<String> getBookNamesOnly();
}
