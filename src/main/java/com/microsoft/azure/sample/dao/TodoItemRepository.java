package com.microsoft.azure.sample.dao;

import com.microsoft.azure.sample.model.TodoItem;
import com.microsoft.azure.spring.data.documentdb.repository.DocumentDbRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoItemRepository extends DocumentDbRepository<TodoItem, String> {
}
