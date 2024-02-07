package com.codebay.goldeneye.Employee.infrastructure;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class EmployeeFormController {
    @GetMapping("api/v1/employee/form")
    public String EmployeeForm(Model model) {

        Map<String, List<String>> officeToDepartments = new HashMap<>();

        // Add some sample data
        List<String> accountingDepts = Arrays.asList("Design", "Business", "Advertising");
        officeToDepartments.put("Milan", accountingDepts);

        List<String> engineeringDepts = Arrays.asList("Research & development", "Business");
        officeToDepartments.put("Spain", engineeringDepts);

        // Return model to view
        model.addAttribute("offices", officeToDepartments);

        return "employeeform";

    }
}