# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.5.4/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.5.4/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.5.4/reference/htmlsingle/#boot-features-developing-web-applications)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)

# How to Run
* Install Mongodb(without compas)
* Install Mongodb Compass
* Create database called ```    BookStore   ```
* Create collection named ```   Book    ```

* You may Insert List, Set, Other Objects into the Document, and I have implemented that
* Now you may pass following Raw JSON Data into Request Body of book/addBook API
```
    {
    "id": 1,
    "name": "Java",
    "isbnNumber": "ISBN-000001",
    "authorInfo": {
        "authorName": "Fahad Shahzad",
        "address": "Sukkur IBA University",
        "phone": "03017021045",
        "gender": "MALE"
    },
    "bookTags": ["Best", "Advance"]
    }
```