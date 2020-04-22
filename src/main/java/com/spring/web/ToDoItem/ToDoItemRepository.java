package com.spring.web.ToDoItem;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ToDoItemRepository extends MongoRepository<ToDoItem, String> {
}


