package com.MyApp.MyApp.config;

import com.MyApp.MyApp.Model.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class Apponfig {

    @Bean
    public List<Employee> AllemployeeList(){

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("1","Seymur","Abdullayev"));
        employeeList.add(new Employee("2","Ferid","Habibli"));
        employeeList.add(new Employee("3","Tural","Mahmudov"));
        employeeList.add(new Employee("4","Mehemmedeli","Huseyinov"));


        return employeeList;
    }


}
