package com.example.unitarias;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.mockito.Mock;

import org.junit.Assert;

import org.junit.Test;

public class FakeApiTest2 {
	@Mock
	IFakeApi fakeapiMock = mock(IFakeApi.class);
	
	IFakeApi trueapi = new FakeApi();
	
	@Test
	public void testDeleteEmployee() {
		long L = 2L;
		Employee employeeToDelete = new Employee((long) 1L, "Jose Gomez", "75343347", 2500.0F);
		
		when(fakeapiMock.existEmployee(L))
			.thenReturn(true);
		when(fakeapiMock.getEmployeeById(L)).thenReturn(employeeToDelete);
		trueapi.deleteEmployee(L);
		Assert.assertEquals(trueapi.getEmployees().size(), 2);
	}
}