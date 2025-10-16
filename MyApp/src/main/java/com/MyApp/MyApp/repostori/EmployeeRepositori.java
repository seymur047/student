package com.MyApp.MyApp.repostori;

import com.MyApp.MyApp.Model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepositori {

    @Autowired
    private List<Employee> employeeList;

    public List<Employee> getAllemployeeList(){

        return employeeList;
    }

    public Employee getEmployeeByID(String ID){

            Employee findEmployee = null;
        for (Employee employee : employeeList){

            if(ID.equals(employee.getID())){

                findEmployee = employee;
                break;
            }
        }

        return findEmployee;
    }


    public List<Employee> getEmployeewithParams1(String firstname, String lastname){

        List<Employee> withparams = new ArrayList<>();

        if(firstname==null && lastname == null){

            return employeeList;

        }
        for (Employee listemployee : employeeList){

            if(firstname != null && lastname != null){
                if(listemployee.getFirstName().equalsIgnoreCase(firstname) && listemployee.getLastName().equalsIgnoreCase(lastname) ){

                    withparams.add(listemployee);
                }
            }
            if(firstname!= null && lastname == null){
                if(listemployee.getFirstName().equalsIgnoreCase(firstname)) {
                    withparams.add(listemployee);
                }
            }
            if (firstname == null && lastname != null){
                if(listemployee.getLastName().equalsIgnoreCase(lastname)){
                    withparams.add(listemployee);
                }
            }
        }

        return withparams;

    }

    public Employee saveEmployee(Employee newEmployee){

        employeeList.add(newEmployee);

        return newEmployee;
    }

    public boolean deleteEmployee(String ID){

        Employee deleteemployee = null;
        for (Employee employee : employeeList){
            if(ID.equals(employee.getID())){
                deleteemployee = employee;
                break;
            }
        }
        if(deleteemployee == null){
            return false;
        }
        employeeList.remove(deleteemployee);
        return true;
    }


    private Employee findemployeeID(String ID ){
        Employee findID = null;
        for (Employee employee : employeeList){

            if(ID.equals(employee.getID())){
                findID = employee;
            }
        }

        return findID;
    }

    public Employee updateEmployee(String ID , Employee request){

        Employee findID = findemployeeID(ID);
        if (findID != null){
            deleteEmployee(ID);

            Employee updatedEmployee = new Employee();
            updatedEmployee.setID(ID);
            updatedEmployee.setFirstName(request.getFirstName());
            updatedEmployee.setLastName(request.getLastName());
            employeeList.add(updatedEmployee);

            return updatedEmployee;
        }
        return null;
    }
}
