package clases;
import clases.Garage;
import clases.Vehiculo;

public class Aplicacion {

	public static void main(String[] args) {
		
		Vehiculo vehiculo1 = new Vehiculo("Toyota", "Corolla", 2020);
	    Vehiculo vehiculo2 = new Vehiculo("Ford", "Fiesta", 2018);
	    Vehiculo vehiculo3 = new Vehiculo("Honda", "Civic", 2022);
	    Vehiculo vehiculo4 = new Vehiculo("Chevrolet", "Spark", 2015);
	    Vehiculo vehiculo5 = new Vehiculo("Nissan", "Sentra", 2021);
	    Vehiculo vehiculo6 = new Vehiculo("Hyundai", "Elantra", 2023);
	    
	    Garage garage = new Garage(5);
	    
	    garage.agregarVehiculo(vehiculo1);
        garage.agregarVehiculo(vehiculo2);
        garage.agregarVehiculo(vehiculo3);
        garage.agregarVehiculo(vehiculo4);
        garage.agregarVehiculo(vehiculo5);

        garage.mostrarVehiculos();

        garage.agregarVehiculo(vehiculo6);
	}
}
