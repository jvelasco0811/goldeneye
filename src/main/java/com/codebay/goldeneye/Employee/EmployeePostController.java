package com.codebay.goldeneye.Employee;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmployeePostController {

    @PostMapping(path = "api/v1/employee", consumes = "application/x-www-form-urlencoded")
    public String genarateEmail(Employee employee) {

        return "employeedata";
    }

}
