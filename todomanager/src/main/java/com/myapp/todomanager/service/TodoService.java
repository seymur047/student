package com.myapp.todomanager.service;

import com.myapp.todomanager.model.Todo;
import com.myapp.todomanager.repostori.TodoRepostori;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    @Autowired
    private TodoRepostori todoRepostori;


    public List<Todo> AllTodoList(){

        return todoRepostori.AllTodoLIst();
    }

    public Todo gettodobyid(String ID){

       return todoRepostori.getTodoid(ID);

    }
}
