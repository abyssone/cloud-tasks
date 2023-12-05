package com.example.micro.employeeservice.controller;

import com.example.micro.employeeservice.model.EmployeeDto;
import com.example.micro.employeeservice.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping("/all")
    public List<EmployeeDto> getAllEmployees() {
        return employeeService.getAll();
    }

    @PostMapping("/create")
    public void createEmployee(EmployeeDto dto) {
        employeeService.save(dto);
    }
}
