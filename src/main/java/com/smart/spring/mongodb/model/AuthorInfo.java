package com.smart.spring.mongodb.model;

import com.smart.spring.mongodb.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class AuthorInfo {
    private String authorName;
    private String address;
    private String phone;
    private Gender gender;

}
