package clases;
import java.util.Scanner;
import clases.Algoritmos;

public class Aplicacion {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int opcion;
		
		do {
			System.out.println("Menú de Algoritmos");
			System.out.println("1. Verificar si el número es par");
			System.out.println("2. Verificar si el número es primo");
			System.out.println("3. Texto en reversa");
			System.out.println("4. Verificar si un texto de palíndromo");
			System.out.println("5. Secuencia Fizzbuzz");
			System.out.println("6. Cerrar menú");
			System.out.println("Selecciona una opción");
			
			opcion = scanner.nextInt();
			
			switch(opcion) {
				case 1:
					System.out.println("Ingresa un número: ");
					 int num = scanner.nextInt();
					if (Algoritmos.esPar(num)) {
	                    System.out.println(num + " es un número par.");
	                } else {
	                    System.out.println(num + " no es un número par.");
	                }
	                break;
	                
				case 2:
					System.out.print("Ingresa un número: ");
                    num = scanner.nextInt();
                    if (Algoritmos.esPrimo(num)) {
                        System.out.println(num + " es un número primo.");
                    } else {
                        System.out.println(num + " no es un número primo.");
                    }
                    break;
                    
				case 3:
					System.out.print("Ingresa una palabra para invertirla: ");
                    String texto = scanner.next();
                    String textoReverso = Algoritmos.stringEnReversa(texto);
                    System.out.println("Texto en reversa: " + textoReverso);
                    
				case 4:
					System.out.print("Ingrese un texto para verificar si es palíndromo: ");
                    String textoPalindromo = scanner.next();
                    if (Algoritmos.esPalindromo(textoPalindromo)) {
                        System.out.println("El texto es un palíndromo.");
                    } else {
                        System.out.println("El texto no es un palíndromo.");
                    }
                    break;
                    
				case 5:
                    System.out.print("Ingrese un número para generar la secuencia FizzBuzz: ");
                    int numeroFizzBuzz = scanner.nextInt();
                    scanner.nextLine();
                    Algoritmos.secuenciaFizzBuzz(numeroFizzBuzz);
                    break;
			}
			
		} while(opcion != 6);
		
	}

}
