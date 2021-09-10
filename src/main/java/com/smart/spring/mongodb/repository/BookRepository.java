package com.smart.spring.mongodb.repository;

import com.smart.spring.mongodb.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, Long> {
}
