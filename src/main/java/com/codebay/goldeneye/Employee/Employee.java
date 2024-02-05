package com.codebay.goldeneye.Employee;

public class Employee {
    private String name;
    private String surname;
    private String office;
    private String department;
    private String email;

    public Employee() {
    }

    public Employee(String name, String surname, String office, String department) {
        this.name = name;
        this.surname = surname;
        this.office = office;
        this.department = department;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getOffice() {
        return this.office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return this.name + "." + this.surname + "@" + this.office + "." + this.department + ".com"; // this.email;
    }

    public void setEmail(String email) {
        this.email = email;
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

}
