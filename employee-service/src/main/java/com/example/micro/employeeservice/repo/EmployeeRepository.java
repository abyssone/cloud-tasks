package com.example.micro.employeeservice.repo;

import com.example.micro.employeeservice.model.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
}
