package com.codebay.goldeneye.Employee.domain;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import Shared.CustomError;
import io.micrometer.core.instrument.config.validate.ValidationException;

public class Employee {

    private String name;
    private String surname;
    private String office;
    private String department;
    private String email;

    public Employee(String name, String surname, String office, String department) {
        // if (name == null || name.isEmpty()) {
        // throw new IllegalArgumentException("Name is required");
        // }
        // validate(name);
        this.name = name;
        this.surname = surname;
        this.office = office;
        this.department = department;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getOffice() {
        return this.office;
    }

    public String getDepartment() {
        return this.department;
    }

    public String getEmail() {
        genarateEmail();
        return this.email;
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + getName() + "'" +
                ", surname='" + getSurname() + "'" +
                ", office='" + getOffice() + "'" +
                ", department='" + getDepartment() + "'" +
                ", email='" + getEmail() + "'" +
                "}";
    }

    public String genarateEmail() {
        String domain = "goldeneye.com";
        char f = this.name.toLowerCase().charAt(0);
        String surn = this.surname.toLowerCase();
        String dep = this.department.toLowerCase().replaceAll("^\\s+|\\s+$", "").replaceAll("[^a-zA-Z0-9]", "");
        String off = this.office.toLowerCase().replaceAll("^\\s+|\\s+$", "").replaceAll("[^a-zA-Z0-9]", "");

        String emailFormated = f + surn + "." + dep + "@" + off + "." + domain;
        return this.email = emailFormated;
    }

    public void validate(String name) {

        if (name == null || name.isEmpty()) {

            throw new CustomError("name_invalid", "Name is required");

        }

    }

}
