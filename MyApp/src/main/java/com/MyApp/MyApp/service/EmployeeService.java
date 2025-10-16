package com.MyApp.MyApp.service;

import com.MyApp.MyApp.Model.Employee;
import com.MyApp.MyApp.repostori.EmployeeRepositori;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepositori employeeRepositori;

    public List<Employee> gettAllEmployeeList(){

        return employeeRepositori.getAllemployeeList();
    }

    public Employee getEmployeeById(String ID){

        return employeeRepositori.getEmployeeByID(ID);

    }

    public List<Employee> getEmployeeWithParam(String firstname,String lastname){

        return employeeRepositori.getEmployeewithParams1(firstname,lastname);
    }

    public Employee saveEmployee(Employee newEmployee){

        return employeeRepositori.saveEmployee(newEmployee);
    }

    public boolean deleteEmployee(String ID){
        return employeeRepositori.deleteEmployee(ID);
    }

    public Employee updateEmployee(String ID , Employee request){

        return employeeRepositori.updateEmployee( ID,request);


    }


}
