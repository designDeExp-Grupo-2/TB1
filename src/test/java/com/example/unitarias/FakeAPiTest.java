package com.example.unitarias;

import org.junit.Assert;
import org.junit.Test;

public class FakeAPiTest {
    @Test
    public void testGetAllEmployee() {
        IFakeApi fakeApi = new FakeApi();
        Assert.assertEquals(fakeApi.getEmployees().size(), 3);
    }

    @Test
    public void testCreateEmployee() {
        IFakeApi fakeApi = new FakeApi();

        Employee newEmployee = new Employee(4L, "Alexis Sanders", "064812648", 58000F);

        fakeApi.createEmployee(newEmployee);

        Employee employeeCreated = fakeApi
                                        .getEmployees()
                                        .stream()
                                        .filter(x -> x.getId().equals(newEmployee.getId()))
                                        .findFirst()
                                        .get();

        Assert.assertEquals(employeeCreated.getId(), newEmployee.getId());
    }

@Test
    public void testDeleteEmployee() {
        IFakeApi fakeApi = new FakeApi();

        Long idToDelete = 1L; // ID del usuario 1 para eliminar.

        fakeApi.deleteEmployee(idToDelete); // Eliminar usuario con ID 1.

        // Comprobar que el Usuario se elimino correctamente.
        Assert.assertNull(fakeApi
                                .getEmployees()
                                .stream()
                                .filter(x -> x.getId() == idToDelete)
                                .findFirst()
                                .orElse(null));


    }

}
