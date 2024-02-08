package com.codebay.goldeneye;

import com.codebay.goldeneye.Employee.application.EmployeeWithEmailGenerator;
import com.codebay.goldeneye.Employee.domain.Employee;
import com.codebay.goldeneye.Employee.infrastructure.EmployeePostController;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(EmployeePostController.class)
public class EmployeePostControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private EmployeeWithEmailGenerator employeeWithEmailGenerator;

    @BeforeEach
    public void setup() {
        // Mock the EmployeeWithEmailGenerator behavior as needed for your tests
        Employee mockedEmployee = new Employee("John", "Doe", "Engineering", "Development");
        when(employeeWithEmailGenerator.createEmployeeWithEmail(anyString(), anyString(), anyString(), anyString()))
                .thenReturn(mockedEmployee);
    }

    @Test
    public void whenPostRequestToEmployeeAndValidUser_thenCorrectResponse() throws Exception {
        // Perform POST request
        mockMvc.perform(post("/api/v1/employee")
                .contentType("application/x-www-form-urlencoded")
                .param("name", "John")
                .param("surname", "Doe")
                .param("office", "Engineering")
                .param("department", "Development"))
                .andExpect(status().isOk()) // Expect 200 OK status
                .andExpect(view().name("employeedata")) // Expect the view name to be returned
                .andExpect(model().attributeExists("employee")); // Expect model attribute "employee"

        // Verify service method was called once
        verify(employeeWithEmailGenerator, times(1))
                .createEmployeeWithEmail("John", "Doe", "Engineering", "Development");
    }
}