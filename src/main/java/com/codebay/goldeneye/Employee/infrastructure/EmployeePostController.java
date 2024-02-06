package com.codebay.goldeneye.Employee.infrastructure;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.codebay.goldeneye.Employee.application.EmployeeEmailGenerator;
import com.codebay.goldeneye.Employee.domain.Employee;

@Controller
public class EmployeePostController {

    private final EmployeeEmailGenerator employeeEmailGenerator;

    public EmployeePostController(EmployeeEmailGenerator employeeEmailGenerator) {
        this.employeeEmailGenerator = employeeEmailGenerator;
    }

    @PostMapping(path = "api/v1/employee", consumes = "application/x-www-form-urlencoded")
    public String genarateEmail(Employee employee) {

        employeeEmailGenerator.generateEmail(employee);

        return "employeedata";
    }

}
