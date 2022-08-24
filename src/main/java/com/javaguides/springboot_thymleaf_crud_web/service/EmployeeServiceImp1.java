package com.javaguides.springboot_thymleaf_crud_web.service;

import com.javaguides.springboot_thymleaf_crud_web.model.Empolyee;
import com.javaguides.springboot_thymleaf_crud_web.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class EmployeeServiceImp1 implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Empolyee> getAllEmployees() {
        return employeeRepository.findAll();

    }

    @Override
    public void saveEmployee(Empolyee empolyee) {
        this.employeeRepository.save(empolyee);
    }
}
