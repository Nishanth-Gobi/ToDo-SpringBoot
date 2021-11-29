package com.example.todo.db;

import org.springframework.data.repository.CrudRepository;

public interface SessionStore extends CrudRepository<Session, String>{

}
