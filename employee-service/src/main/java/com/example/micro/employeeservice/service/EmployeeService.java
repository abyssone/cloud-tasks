package com.example.micro.employeeservice.service;

import com.example.micro.employeeservice.model.EmployeeDto;
import com.example.micro.employeeservice.model.EmployeeEntity;
import com.example.micro.employeeservice.repo.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository repo;

    public void save(EmployeeDto dto) {
        EmployeeEntity employeeEntity = EmployeeEntity.builder()
                .name(dto.getName())
                .position(dto.getPosition())
                .build();
        repo.save(employeeEntity);
    }

    public List<EmployeeDto> getAll() {
        List<EmployeeEntity> entityList = repo.findAll();
        return entityList.stream().map(entity ->
            EmployeeDto.builder()
                    .id(entity.getId())
                    .name(entity.getName())
                    .position(entity.getPosition())
                    .build()).toList();
    }
}
