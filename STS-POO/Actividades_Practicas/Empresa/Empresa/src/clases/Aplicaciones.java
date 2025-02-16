package clases;

import clases.Director;
import clases.Empleado;
import clases.Gerente;

public class Aplicaciones {

	public static void main(String[] args) {
		
		Empleado empleado = new Empleado("Carlos", 1, 100000);
        Gerente gerente = new Gerente("Debora", 2, 250000, 50000);
        Director director = new Director("Felix", 3, 500000, 10000, 2000);


        System.out.println("\n--- Información de Empleado ---");
        empleado.mostrarInformacion();

        System.out.println("\n--- Información de Gerente ---");
        gerente.mostrarInformacion();

        System.out.println("\n--- Información de Director ---");
        director.mostrarInformacion();
    }

}
