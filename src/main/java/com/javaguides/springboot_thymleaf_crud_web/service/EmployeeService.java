package com.javaguides.springboot_thymleaf_crud_web.service;

import com.javaguides.springboot_thymleaf_crud_web.model.Empolyee;

import java.util.List;

public interface EmployeeService {
    List<Empolyee> getAllEmployees();

    void saveEmployee(Empolyee empolyee);
}
