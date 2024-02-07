package com.codebay.goldeneye.Employee.application;

import org.springframework.stereotype.Service;

import com.codebay.goldeneye.Employee.domain.Employee;

@Service
public class EmployeeWithEmailGenerator {

    public Employee createEmployeeWithEmail(String name, String surnamme, String office, String department) {

        Employee employeeWithEmail = new Employee(name, surnamme, office, department);

        return employeeWithEmail;

    }

}
