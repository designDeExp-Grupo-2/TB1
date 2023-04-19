// Ejemplo tomado de https://www.arquitecturajava.com/java-mockito-y-los-mock-objects/

package com.example.unitarias;

public interface ServicioB {

  public ServicioA getServicioA();

  public void setServicioA(ServicioA servicioA);

  public int multiplicarSumar(int a, int b, int multiplicador);

  public int multiplicar(int a, int b);

}
