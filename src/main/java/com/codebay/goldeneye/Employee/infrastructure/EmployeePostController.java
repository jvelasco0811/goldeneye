package com.codebay.goldeneye.Employee.infrastructure;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;

import com.codebay.goldeneye.Employee.application.EmployeeWithEmailGenerator;
import com.codebay.goldeneye.Employee.domain.Employee;

@Controller
public class EmployeePostController {

    private final EmployeeWithEmailGenerator employeeWithEmailGenerator;

    public EmployeePostController(EmployeeWithEmailGenerator employeeWithEmailGenerator) {
        this.employeeWithEmailGenerator = employeeWithEmailGenerator;
    }

    @PostMapping(path = "api/v1/employee", consumes = "application/x-www-form-urlencoded")
    public String genarateEmail(String name, String surname, String office, String department,
            Model model) {

        String webEndpoint = "employee_result";
        try {
            Employee employee = employeeWithEmailGenerator.createEmployeeWithEmail(name,
                    surname, office, department);

            model.addAttribute("hasErrors", false);

            model.addAttribute("employee", employee);

            webEndpoint = "employee_result";
        } catch (Exception e) {
            model.addAttribute("hasErrors", true);
            webEndpoint = "employee_form";
        }
        return webEndpoint;

    }

}
