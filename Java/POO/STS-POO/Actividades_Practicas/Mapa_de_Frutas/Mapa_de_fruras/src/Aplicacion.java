import java.util.HashMap;
import java.util.Map;


public class Aplicacion {

	public static void main(String[] args) {
		Map<String, Integer> Frutas = new HashMap<>();

		Frutas.put("Frutillas", 30 );
		Frutas.put("Plátano", 5);
		Frutas.put("Manzana", 3);
		Frutas.put("Pina", 1);
		Frutas.put("kiwi", 12);
		
		String frutaBuscada = "Frutillas";
		System.out.println("La cantidad de " + frutaBuscada + " es: " + Frutas.get(frutaBuscada));
		
		System.out.println("LISTA DE FRUTAS: ");
		for (Map.Entry<String, Integer> entry : Frutas.entrySet()) { //entryset -> nos da acceso a cada par clave-valor
			System.out.println(entry.getKey() + ": " +  entry.getValue());
			
		}
	}

}
