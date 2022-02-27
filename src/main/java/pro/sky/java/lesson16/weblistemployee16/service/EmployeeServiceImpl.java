package pro.sky.java.lesson16.weblistemployee16.service;

import org.springframework.stereotype.Service;
import pro.sky.java.lesson16.weblistemployee16.exceptions.EmployeeIsAlreadyInsideListException;
import pro.sky.java.lesson16.weblistemployee16.exceptions.EmployeeIsNotFoundException;


import java.util.ArrayList;


@Service
public class EmployeeServiceImpl implements EmployeeService {

    ArrayList<Employee> employeeList = new ArrayList<>();

    @Override
    public Employee addEmployee(String firstName, String lastName) {
        Employee addingEmployee = new Employee(firstName, lastName);
        if (employeeList.contains(addingEmployee)) {
            throw new EmployeeIsAlreadyInsideListException("Employee is already inside list.");
        }
        employeeList.add(addingEmployee);
        return addingEmployee;
    }

    @Override
    public Employee removeEmployee(String firstName, String lastName) {
        Employee removingEmployee = new Employee(firstName, lastName);
        if (employeeList.contains(removingEmployee)) {
            employeeList.remove(removingEmployee);
        } else {
            throw new EmployeeIsNotFoundException("Employee is not found.");
        }
        return removingEmployee;
    }

    @Override
    public Employee findEmployee(String firstName, String lastName) {
        Employee ourEmployee = new Employee(firstName, lastName);
        if (employeeList.contains(ourEmployee)) {
            return ourEmployee;
        } else {
            throw new EmployeeIsNotFoundException("Employee is not found");
        }
    }

    @Override
    public ArrayList <Employee> printAllEmployees() {
        return employeeList;
    }
}
