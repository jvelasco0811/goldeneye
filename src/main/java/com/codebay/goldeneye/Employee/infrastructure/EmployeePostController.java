package com.codebay.goldeneye.Employee.infrastructure;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import com.codebay.goldeneye.Employee.application.EmployeeWithEmailGenerator;
import com.codebay.goldeneye.Employee.domain.Employee;

import Shared.CustomError;

@Controller
public class EmployeePostController {

    private final EmployeeWithEmailGenerator employeeWithEmailGenerator;

    public EmployeePostController(EmployeeWithEmailGenerator employeeWithEmailGenerator) {
        this.employeeWithEmailGenerator = employeeWithEmailGenerator;
    }

    @PostMapping(path = "api/v1/employee", consumes = "application/x-www-form-urlencoded")
    public String genarateEmail(String name, String surname, String office, String department, Model model) {

        try {

            Employee employee = employeeWithEmailGenerator.createEmployeeWithEmail(name, surname, office, department);

            model.addAttribute("employee", employee);

            return "employeedata";

        } catch (Exception e) {
            throw new CustomError("name_invalid", "Name is required");
        }
    }

}
