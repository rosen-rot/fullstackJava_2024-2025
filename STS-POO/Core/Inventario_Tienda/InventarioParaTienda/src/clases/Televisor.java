package clases;

public class Televisor extends ProductoElectrodomestico{

	
	private double tamanoPantalla;
	private String resolucion;
	
	public Televisor(String nombre, double precio, int cantidadDisponible, double tamanoPantalla, String resolucion) {
		super(nombre, precio, cantidadDisponible);
		this.tamanoPantalla = tamanoPantalla;
		this.resolucion = resolucion;
	}

	@Override
	public void mostrarInformacion() {
		super.mostrarInformacion();
		System.out.println("Tamaño de la pantalla: " + tamanoPantalla);
		System.out.println("Resolución: " + resolucion);
	}
	
	
}
