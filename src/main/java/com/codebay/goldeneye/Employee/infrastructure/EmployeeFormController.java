package com.codebay.goldeneye.Employee.infrastructure;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class EmployeeFormController {
    @GetMapping("api/v1/employee/form")
    public String EmployeeForm(Model model) {
        return "htmltemplate";

    }
}