// Ejemplo tomado de https://www.arquitecturajava.com/java-mockito-y-los-mock-objects/

package com.example.unitarias;

import org.junit.Assert;
import org.junit.Test;

public class ServicioATest {

	@Test
	public void testSuma() {
		int a = 2;
		int b = 2;
		ServicioA servicio = new ServicioAImpl();
		Assert.assertEquals(servicio.sumar(a, b), 4);
	}

}
