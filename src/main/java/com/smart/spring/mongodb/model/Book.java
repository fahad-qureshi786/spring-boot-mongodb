package com.smart.spring.mongodb.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Getter
@Setter
@ToString

@Document(collection = "book")
public class Book {
    @Id
    private Long id;
    private String name;
    private String isbnNumber;

}
