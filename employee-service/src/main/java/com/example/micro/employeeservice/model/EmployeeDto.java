package com.example.micro.employeeservice.model;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {

    private Long id;

    private String name;

    private String position;
}
