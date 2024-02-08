package com.codebay.goldeneye;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;

import com.codebay.goldeneye.Employee.application.EmployeeWithEmailGenerator;
import com.codebay.goldeneye.Employee.domain.Employee;
import com.codebay.goldeneye.Shared.CustomError;

public class EmployeeWithEmailGeneratorTest {

    private EmployeeWithEmailGenerator employeeWithEmailGenerator;

    @BeforeEach
    void setUp() {
        employeeWithEmailGenerator = new EmployeeWithEmailGenerator();
    }

    @Test
    void testCreateEmployeeWithEmail() {

        String name = "Ramon";
        String surname = "Villanueva";
        String office = "Milan";
        String department = "IT Engineering";

        Employee result = employeeWithEmailGenerator.createEmployeeWithEmail(name, surname, office, department);

        assertNotNull(result, "Employee object should not be null");
        assertEquals(name, result.getName(), "Employee name did not match the expected value");
        assertEquals(surname, result.getSurname(), "Employee surname did not match the expected value");
        assertEquals(office, result.getOffice(), "Employee office did not match the expected value");
        assertEquals(department, result.getDepartment(), "Employee department did not match the expected value");

        assertNotNull(result.getEmail(), "Employee email should not be null");

        String expectedEmail = "rvillanueva.itengineering@milan.goldeneye.com";
        assertEquals(expectedEmail, result.getEmail(), "Employee email did not match the expected format");
    }

    @Test
    void whenNameIsNull_thenThrowsCustomError() {
        assertThrows(CustomError.class, () -> {
            employeeWithEmailGenerator.createEmployeeWithEmail(null, "Doe", "Engineering", "Development");
        }, "CustomError expected when name is null");
    }

    @Test
    void whenSurnameIsNull_thenThrowsCustomError() {
        assertThrows(CustomError.class, () -> {
            employeeWithEmailGenerator.createEmployeeWithEmail("John", null, "Engineering", "Development");
        }, "CustomError expected when surname is null");
    }

    @Test
    void whenOfficeIsNull_thenThrowsCustomError() {
        assertThrows(CustomError.class, () -> {
            employeeWithEmailGenerator.createEmployeeWithEmail("John", "Doe", null, "Development");
        }, "CustomError expected when office is null");
    }

    @Test
    void whenDepartmentIsNull_thenThrowsCustomError() {
        assertThrows(CustomError.class, () -> {
            employeeWithEmailGenerator.createEmployeeWithEmail("John", "Doe", "Engineering", null);
        }, "CustomError expected when department is null");
    }
}
