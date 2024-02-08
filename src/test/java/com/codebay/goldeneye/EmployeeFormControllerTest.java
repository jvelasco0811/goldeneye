package com.codebay.goldeneye;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import com.codebay.goldeneye.Employee.infrastructure.EmployeeFormController;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@WebMvcTest(EmployeeFormController.class)
public class EmployeeFormControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void whenEmployeeFormRequested_thenReturnEmployeeFormView() throws Exception {

        mockMvc.perform(get("/api/v1/employee/form"))
                .andExpect(status().isOk()) // Assert HTTP 200 status code
                .andExpect(view().name("employee_form")); // Assert view name
    }
}