package com.myapp.todomanager.repostori;

import com.myapp.todomanager.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TodoRepostori {


    @Autowired
    public List<Todo> todoList;

    public List<Todo> AllTodoLIst(){

        return todoList;
    }

    public Todo getTodoid(String ID){

        Todo findTodoid = null;
       for (Todo todo : todoList){

           if (ID.equals(todo.getID())){
               findTodoid = todo;
           }

       }

       return findTodoid;
    }
}
