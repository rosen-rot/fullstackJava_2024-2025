package com.icedwork.ice;

public class Bicicleta extends Vehiculo implements ManejarVehiculo{
	
	
	public Bicicleta(int anio, String marca, String modelo, String color, int ruedas) {
		super(anio, marca, modelo, color, ruedas);
	}

	public void acelerar() {
		System.out.println("PEdaleo más rápido");
		velocidad++;
		System.out.println("Mi velocidad es de: " + velocidad);
	}
	
	public void desacelerar() {
		System.out.println("Bajo los pies para parar");
		velocidad--;
		System.out.println("Mi velocidad es de: " + velocidad);
	}
}
