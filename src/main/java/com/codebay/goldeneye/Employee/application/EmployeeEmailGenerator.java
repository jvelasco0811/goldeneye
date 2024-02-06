package com.codebay.goldeneye.Employee.application;

import org.springframework.stereotype.Service;

import com.codebay.goldeneye.Employee.domain.Employee;

@Service
public class EmployeeEmailGenerator {

    public void generateEmail(Employee employee) {
        
        

        System.out.println(employee);
    }

}
