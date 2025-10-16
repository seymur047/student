package com.MyApp.MyApp.controller;

import com.MyApp.MyApp.Model.Employee;
import com.MyApp.MyApp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.yaml.snakeyaml.events.Event;

import java.util.List;

@RestController
@RequestMapping("/rest/api/employee")
public class RestEmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping(path = "/list")
    public List<Employee> AllEmpoloyeeList(){

        return employeeService.gettAllEmployeeList();
    }

    @GetMapping(path = "/list/{ID}")
    public Employee getEmployeeByID(@PathVariable(name = "ID", required = true) String ID){

        return employeeService.getEmployeeById(ID);

    }

    @GetMapping(path = "/list-with-params")
    public List<Employee> getEmployeeListParam(@RequestParam(name = "firstName",required = false)String firstname,
                                                 @RequestParam(name = "lastName",required = false)String lastname){


        return employeeService.getEmployeeWithParam(firstname,lastname);
    }

    @PostMapping(path = "/save-employee")
    public Employee saveEmployee(@RequestBody Employee newEmployee){

        return employeeService.saveEmployee(newEmployee);
    }

    @DeleteMapping(path = "/delete-employee/{ID}")
    public boolean deleteID(@PathVariable(name = "ID") String ID){


        return  employeeService.deleteEmployee(ID);
    }

    @PutMapping(path = "/update-employee/{ID}")
    public Employee updateEmployee(@PathVariable(name = "ID")String ID,@RequestBody Employee request){


        return employeeService.updateEmployee(ID,request);
    }
}
