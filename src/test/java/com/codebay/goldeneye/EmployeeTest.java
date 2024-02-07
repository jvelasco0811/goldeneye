package com.codebay.goldeneye;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.codebay.goldeneye.Employee.domain.Employee;

public class EmployeeTest {

    Employee employee;

    @BeforeEach
    void setUp() {
        employee = new Employee("ricardo", "tapia", "london", "Business");
    }

    @Test
    void testEmployee() {
        assertEquals("ricardo", employee.getName());
    }

}
