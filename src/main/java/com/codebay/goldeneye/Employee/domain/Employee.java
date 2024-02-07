package com.codebay.goldeneye.Employee.domain;

public class Employee {

    private String name;
    private String surname;
    private String office;
    private String department;
    private String email;

    public Employee(String name, String surname, String office, String department) {
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

    public void createEmail() {
        String domain = "goldeneye.com";
        char f = this.name.toLowerCase().charAt(0);
        String surn = this.surname.toLowerCase();
        String dep = this.department.toLowerCase().replaceAll("^\\s+|\\s+$", "").replaceAll("[^a-zA-Z0-9]", "");
        String off = this.office.toLowerCase().replaceAll("^\\s+|\\s+$", "").replaceAll("[^a-zA-Z0-9]", "");

        String emailFormated = f + surn + "." + dep + "@" + off + "." + domain;
        this.email = emailFormated;
    }

}
