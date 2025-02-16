package clases;

public class Algoritmos {

	public static boolean esPar(int num) {
        return num % 2 == 0;
    }
	
	public static boolean esPrimo(int num) {
		if(num <=1) return false;
		for(int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) return false;
		}
		return true;
	}
	
	public static String stringEnReversa(String texto) {
	    char[] caracteres = texto.toCharArray(); // String --> Array
	    char[] reversa = new char[caracteres.length]; // nuevo array --> almacenar 

	    for (int i = 0; i < caracteres.length; i++) {
	        reversa[i] = caracteres[caracteres.length - 1 - i];
	    }
	    return new String(reversa);
	}

	public static boolean esPalindromo(String texto) {
		char[] caracteres = texto.toCharArray();
		
		for(int i = 0; i < caracteres.length / 2; i++) {
			if (caracteres[i] != caracteres[caracteres.length - 1 - i]) {
	            return false;
			}
		}
		return true;
	}
	
	public static void secuenciaFizzBuzz(int num) {
		for (int i = 1; i <= num; i++) {
			if(i % 3 == 0) {
				System.out.println("Fizz");
			}
			else if(i % 5 == 0) {
				System.out.println("Buzz");
			}
			else if(i % 3 == 0 && i % 5 == 0) {
				System.out.println("Fizzbuzz");
			}
			else {
	            System.out.print(i + " ");
	        }
		}
	}
}
	
