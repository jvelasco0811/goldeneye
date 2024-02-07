package com.codebay.goldeneye.Employee.domain;

import com.codebay.goldeneye.Shared.CustomError;

public class Employee {

    private String name;
    private String surname;
    private String office;
    private String department;
    private String email;

    public Employee(String name, String surname, String office, String department) {
        validate(name, surname, office, department);
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
        createEmail();
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

    private void createEmail() {
        String domain = "goldeneye.com";
        char f = this.name.toLowerCase().charAt(0);
        String surn = this.surname.toLowerCase().replaceAll("^\\s+|\\s+$",
                "").replaceAll("[^a-zA-Z0-9]", "");
        String dep = this.department.toLowerCase().replaceAll("^\\s+|\\s+$",
                "").replaceAll("[^a-zA-Z0-9]", "");
        String off = this.office.toLowerCase().replaceAll("^\\s+|\\s+$",
                "").replaceAll("[^a-zA-Z0-9]", "");

        String emailFormated = f + surn + "." + dep + "@" + off + "." + domain;
        this.email = emailFormated;
    }

    private void validate(String name, String surname, String office, String department) {

        if (name == null || name.isBlank()) {
            throw new CustomError("name_invalid", "Name cannot be null or blank");
        }

        if (surname == null || surname.isBlank()) {
            throw new CustomError("surname_invalid", "Surname cannot be null or blank");
        }

        if (office == null || office.isBlank()) {
            throw new CustomError("office_invalid", "Office cannot be null or blank");
        }

        if (department == null || department.isBlank()) {
            throw new CustomError("department_invalid", "Department cannot be null or blank");
        }

        if (name.length() < 2 || name.length() > 20) {
            throw new CustomError("name_invalid",
                    "Name should be shorter than 20 characters or longer of 2 characters");
        }

        if (name.length() < 2 || surname.length() > 20) {
            throw new CustomError("name_invalid",
                    "Surname should be shorter than 20 characters or longer of 2 characters");
        }

        if (office.length() < 2 || office.length() > 20) {
            throw new CustomError("office_invalid",
                    "Office should be shorter than 20 characters or longer of 2 characters");
        }

        if (department.length() < 2 || department.length() > 35) {
            throw new CustomError("department_invalid",
                    "Department should be shorter than 35 characters or longer of 2 characters");
        }

    }

}
