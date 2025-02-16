package clases;
import java.util.ArrayList;

public class Garage {
	
	private ArrayList<Vehiculo> vehiculos;
	private int capacidad;
	
	public Garage(int capacidad) {
		this.vehiculos = new ArrayList<>();
		this.capacidad = capacidad;
	}
	
	public void agregarVehiculo(Vehiculo vehiculo) {
		if(vehiculos.size() < capacidad) {
			vehiculos.add(vehiculo);
			System.out.println("Nuevo Vehiculo: " + vehiculo.despliegaInformacion());
		}else {
			System.out.println("No hay espacio en el garage para nuevos vehículos.");
		}
	}
	
	public void mostrarVehiculos() {
		if(vehiculos.isEmpty()) {
			System.out.println("El garage está vacío");
		}else {
			for (Vehiculo v : vehiculos) {
				System.out.println(v.despliegaInformacion());
				
			/*for (int i = 0; i < vehiculos.size(); i++) {
    			Vehiculo v = vehiculos.get(i);
    			System.out.println(v.despliegaInformacion());
			}
			 */
			}
		}
	}
}
