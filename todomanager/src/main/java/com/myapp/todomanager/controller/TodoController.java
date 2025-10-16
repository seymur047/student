package com.myapp.todomanager.controller;

import com.myapp.todomanager.model.Todo;
import com.myapp.todomanager.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping
    public List<Todo> getTodoList() {
        return todoService.AllTodoList();
    }

    @GetMapping("/{ID}")
    public Todo gettodobyid(@PathVariable(name = "ID", required = true) String ID) {


        return todoService.gettodobyid(ID);
    }
}