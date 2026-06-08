package com.demo.openswe_demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.openswe_demo.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{

}
