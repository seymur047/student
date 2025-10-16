package com.myapp.todomanager.config;

import com.myapp.todomanager.model.Todo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class Appconfing {

    @Bean
    public List<Todo> AllTodoList(){
        List<Todo> todos = new ArrayList<>();

        todos.add(new Todo("1","buy milk" , false));
        todos.add(new Todo("2","Pay electricity bill" , true));
        todos.add(new Todo("3","Call Ferid" , false));
        todos.add(new Todo("4","Finish Spring project" , false));


        return todos;
    }
}
