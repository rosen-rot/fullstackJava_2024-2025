package clases;

import clases.Cuadrado;
import clases.TrianguloEq;

public class Aplicacion {

	public static void main(String[] args) {
		
		Cuadrado cuad1 = new Cuadrado(10);
		TrianguloEq tr1 = new TrianguloEq(10, 5);
		
		System.out.println("Área cuadrado: " + cuad1.area());
		System.out.println("Área triángulo: " + tr1.area());
	}

}
