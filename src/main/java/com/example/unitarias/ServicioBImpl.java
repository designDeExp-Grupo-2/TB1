// Ejemplo tomado de https://www.arquitecturajava.com/java-mockito-y-los-mock-objects/

package com.example.unitarias;

public class ServicioBImpl implements ServicioB {

	private ServicioA servicioA;

	public ServicioA getServicioA() {
		return servicioA;
	}

	public void setServicioA(ServicioA servicioA) {
		this.servicioA = servicioA;
	}

	public int multiplicarSumar(int a, int b, int multiplicador) {
		return servicioA.sumar(a, b) * multiplicador;
	}

	public int multiplicar(int a, int b) {
		return a * b;
	}

}
