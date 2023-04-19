package com.example.unitarias;

import java.util.List;
import java.util.Optional;

public interface IFakeApi {
    List<Employee> getEmployees();
    Optional<Employee> createEmployee(Employee newEmployee);
    Boolean updateEmployee(Employee employeeData);
    Boolean deleteEmployee(Long id);
    Employee getEmployeeById(Long id);
}
