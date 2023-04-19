// Ejemplo tomado de https://www.arquitecturajava.com/java-mockito-y-los-mock-objects/

package com.example.unitarias;

import org.junit.Assert;
import org.junit.Test;

public class ServicioBTest {

	@Test
	public void testMultiplicacion() {
		ServicioB servicioB = new ServicioBImpl();
		Assert.assertEquals(servicioB.multiplicar(2, 3), 6);
	}

	@Test
	public void testmultiplicarSumar() {
		ServicioA servicioA = new ServicioAImpl();
		ServicioB servicioB = new ServicioBImpl();

		servicioB.setServicioA(servicioA);
		Assert.assertEquals(servicioB.multiplicarSumar(2, 3, 2), 10);
	}

}
