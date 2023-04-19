package com.example.unitarias;

public class Employee {
    private Long id;
    private String fullName;
    private String dni;
    private Float salary;

    public Employee() {}

    public Employee(Long id, String fullName, String dni, Float salary) {
        this.id = id;
        this.fullName = fullName;
        this.dni = dni;
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }
}
