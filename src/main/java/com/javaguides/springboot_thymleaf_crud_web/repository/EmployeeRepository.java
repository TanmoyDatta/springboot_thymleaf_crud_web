package com.javaguides.springboot_thymleaf_crud_web.repository;

import com.javaguides.springboot_thymleaf_crud_web.model.Empolyee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Empolyee,Long>{
}
