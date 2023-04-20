package com.example.unitarias;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FakeApi implements IFakeApi{
    private List<Employee> employees = new ArrayList<Employee>();

    public FakeApi() {
        employees.add(new Employee((long) 1L, "Jose Gomez", "75343347", 2500.0F));
        employees.add(new Employee((long) 2L, "Anderson Silva", "95545121", 4500.0F));
        employees.add(new Employee((long) 3L, "David Rank", "4545481212", 28900.0F));
    }

    public List<Employee> getEmployees() {
        return this.employees;
    }

    public Optional<Employee> createEmployee(Employee newEmployee) {
        this.employees.add(newEmployee);
        return this.employees.stream().filter(x -> x.getId().equals(newEmployee.getId())).findFirst();
    }

    public Boolean updateEmployee(Employee employeeData) {
        Employee employeeToUpdate = this.employees.stream().filter(x -> x.getId().equals(employeeData.getId())).findFirst().orElse(null);

        if (employeeToUpdate == null)
            return false;

        employeeToUpdate.setFullName(employeeData.getFullName());
        employeeToUpdate.setDni(employeeData.getDni());
        employeeToUpdate.setSalary(employeeData.getSalary());

        return true;
    }

    public Employee getEmployeeById(Long id) {
        return this.employees.stream().filter(x -> x.getId().equals(id)).findFirst().get();
    }

    public void deleteEmployee(Long id) {
    	if (existEmployee(id)) {
        employees.removeIf(x -> x.getId().equals(id));
    	}	
    }

	public Boolean existEmployee(Long id) {
		Employee employee = this.getEmployeeById(id);
		return employee != null;
	}
}
