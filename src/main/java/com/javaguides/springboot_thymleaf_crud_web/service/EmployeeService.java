package com.javaguides.springboot_thymleaf_crud_web.service;

import com.javaguides.springboot_thymleaf_crud_web.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeeById(long id);
}
