package pro.sky.java.lesson16.weblistemployee16.service;

import java.util.ArrayList;

public interface EmployeeService {

    Employee addEmployee(String firstName, String lastName);

    Employee removeEmployee(String firstName, String lastName);

    Employee findEmployee(String firstName, String lastName);

    ArrayList <Employee> printAllEmployees();
}
