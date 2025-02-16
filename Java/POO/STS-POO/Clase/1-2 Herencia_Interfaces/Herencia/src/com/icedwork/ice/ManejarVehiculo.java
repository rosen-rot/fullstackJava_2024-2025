package com.icedwork.ice;

public interface ManejarVehiculo {

	/*metodo default: No necesito ser implementado sino que directamente se hereda, funciona por sí solo*/
	public default void manejar() {
		System.out.println("Se está manejando el vehículo");
	}
	/* metodo abstracto: Obliga a la clase a implementarla, porque requiere que cada clase indique la manera en que funciona*/
	abstract void acelerar();
	abstract void desacelerar();
	
	/* metodo estatico: pertenece a la interfaz*/
}
