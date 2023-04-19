// Ejemplo tomado de https://www.arquitecturajava.com/java-mockito-y-los-mock-objects/

package com.example.unitarias;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import org.junit.Assert;
import org.junit.Test;

public class ServicioBTestMock {

	@Mock
	ServicioA servicioA = mock(ServicioA.class);
	@InjectMocks
	ServicioB servicioB = new ServicioBImpl();

	@Test
	public void testmultiplicarSumarMock() {
		when(servicioA.sumar(2,3)).thenReturn(5);
		servicioB.setServicioA(servicioA);
		Assert.assertEquals(servicioB.multiplicarSumar(2, 3, 2),10);	
	}

}
