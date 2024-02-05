package com.codebay.goldeneye.Employee;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeePostController {

    @PostMapping(path = "api/v1/employee", consumes = "application/x-www-form-urlencoded")
    public Employee genarateEmail(Employee employee) {

        return employee;
    }

}
