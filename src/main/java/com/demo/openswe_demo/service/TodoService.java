package com.demo.openswe_demo.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.openswe_demo.entity.Todo;
import com.demo.openswe_demo.repo.TodoRepository;

@Service
public class TodoService {

    private final TodoRepository repository;

    public TodoService(TodoRepository repository) {
        this.repository = repository;
    }

    public List<Todo> findAll() {
        return repository.findAll();
    }

    public Todo save(Todo todo) {
        return repository.save(todo);
    }
}