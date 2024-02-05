package com.codebay.goldeneye.Employee;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class EmployeeFormController {
    @GetMapping("api/v1/employee/form")
    public String EmployeeForm() {
        return "employeeform";
        // return "New employee created";
    }
}