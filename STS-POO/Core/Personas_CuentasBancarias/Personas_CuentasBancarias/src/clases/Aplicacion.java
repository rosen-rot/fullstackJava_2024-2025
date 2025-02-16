package clases;

import clases.CuentaBancaria;
import clases.Persona;

public class Aplicacion {

	public static void main(String[] args) {
		
		//isntancias de personas
		Persona persona1 = new Persona("Teresa", 22);
		Persona persona2 = new Persona("Nathan", 25);
		Persona persona3 = new Persona("Allan", 25);
		Persona persona4 = new Persona("Matthew", 26);
		Persona persona5 = new Persona("Ronsenrot", 23);

		//instancias de cuentas
		CuentaBancaria cuenta1 = new CuentaBancaria(12000, "Teresa");
		CuentaBancaria cuenta2 = new CuentaBancaria(16000, "Nathan");
		CuentaBancaria cuenta3 = new CuentaBancaria(3000, "Allan");
		CuentaBancaria cuenta4 = new CuentaBancaria(14000, "Matthew");
		CuentaBancaria cuenta5 = new CuentaBancaria(7000, "Ronsenrot");
		
		cuenta1.depositar(7000);
        cuenta2.retirar(5005);
        cuenta5.depositar(200000);

        System.out.println("\nSaldo actual de cada cuenta:");
        cuenta1.despliegaInformacion();
        cuenta2.despliegaInformacion();
        cuenta3.despliegaInformacion();

        System.out.println("\nInformación de todas las cuentas:");
        CuentaBancaria.imprimeInformacionDeTodasLasCuentas();
	}

}
