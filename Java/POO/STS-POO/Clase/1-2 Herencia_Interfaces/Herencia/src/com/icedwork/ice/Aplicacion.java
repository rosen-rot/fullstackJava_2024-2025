package com.icedwork.ice;

public class Aplicacion {

	public static void main(String[] args) {
		//sysout + ctrl + space atajo del System.out.println()
		
		Vehiculo auto1 = new Vehiculo(2000, "Kia", "Morning", "Gris metalizado", 4);
		System.out.println("La marca del vehículo es " + auto1.getMarca());
		
		Auto nuevoAuto = new Auto(2010, "Honda", "Civic", "Rojo", 4, 5);
	    nuevoAuto.imprimeMarcaModelo();
	    
	    Bicicleta bici = new Bicicleta(2000, "China", "B12WR", "Roja", 2);
	    
	    nuevoAuto.acelerar();
	    nuevoAuto.acelerar();
	    nuevoAuto.acelerar();
	    nuevoAuto.manejar();
	    nuevoAuto.desacelerar();
	    
	    System.out.println("----------------");
	    
	    bici.acelerar();
	    bici.acelerar();
	    bici.acelerar();
	    bici.manejar();
	    bici.desacelerar();
	}

}
