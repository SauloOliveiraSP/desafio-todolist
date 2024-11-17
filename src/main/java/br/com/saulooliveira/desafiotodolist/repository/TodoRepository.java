package br.com.saulooliveira.desafiotodolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.saulooliveira.desafiotodolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{
    
}
