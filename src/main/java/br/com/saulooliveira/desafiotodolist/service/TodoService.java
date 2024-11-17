package br.com.saulooliveira.desafiotodolist.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.saulooliveira.desafiotodolist.controller.Todo;
import br.com.saulooliveira.desafiotodolist.repository.TodoRepository;

@Service    
public class TodoService {
    private TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> create(Todo todo) { 
        todoRepository.save(todo);
        return list();
    }
    public List<Todo> list() {
        Sort sort = Sort.by("prioridade").descending().and(
            Sort.by("nome").ascending());
        return todoRepository.findAll(sort);
    }

    public List<Todo> update(Todo todo) {
        todoRepository.save(todo);
        return list();
    }

    public List<Todo> delete(Long id) {
        todoRepository.deleteById(id);
        return list();
    }
}