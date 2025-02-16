package com.icedwork.ice;

public class Auto extends Vehiculo implements ManejarVehiculo {
	
	// Todos los atributos y métodos del padre Vehiculo son heredados
	
	private int puertas;

	public Auto(int anio, String marca, String modelo, String color, int ruedas, int puertas) {
		super(anio, marca, modelo, color, ruedas);
		this.puertas = puertas;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	
	public void imprimeMarcaModelo() {
        System.out.println(super.getMarca()+"-"+super.getModelo());
    }

	@Override
	public void acelerar() {
		System.out.println("Estamos pisando el acelerador");
		velocidad += 2;
		System.out.println("Mi velocidad es de: " + velocidad);
		
	}

	@Override
	public void desacelerar() {
		System.out.println("Estamos pisando el freno");
		velocidad -= 2;
		System.out.println("Mi velocidad es de: " + velocidad);
		
	}
}
