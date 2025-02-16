package clases;
import java.util.ArrayList;

public class Prestamo {
	
	private String nombre;
	private ArrayList<Libro> libros;
	private boolean status;
	
	// Constructor sin argumentos,  permite instanciar un préstamo sin necesidad de proporcionar detalles inmediatamente.
	public Prestamo() {
		this.nombre = "invitado";
		this.libros = new ArrayList<>();
		this.status = true;
	}

	 // Constructor sobrecargado
	public Prestamo(String nombre, boolean status) {
		this.nombre = nombre;
		this.libros = new ArrayList<>();
		this.status = status;
	}

	public String getNombre() {
		return nombre;
	}

	public ArrayList<Libro> getLibros() {
		return libros;
	}

	public boolean isStatus() {
		return status;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setLibros(ArrayList<Libro> libros) {
		this.libros = libros;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	//Metodos
	public void agregarLibro(Libro libro){
		libros.add(libro);
	}
	
	
	public String mostrarEstatus(){
		return status ? "El prestamo está activo." : "El prestamo está inactivo";
		/*Operador ternario: es un operador compacto para realizar una operación condicional. Se divide en tres partes:

		estatus: Es la condición que se evalúa. En este caso, el atributo estatus es de tipo boolean y puede ser true o false.
		"El préstamo está activo.": Este es el valor que se devuelve si estatus es true.
		"El préstamo está inactivo.": Este es el valor que se devuelve si estatus es false.
		
		El valor retornado:
		Si estatus es true, el método devuelve "El préstamo está activo.".
		Si estatus es false, devuelve "El préstamo está inactivo.".*/
	}
	
	public void mostrarDetallesDelPrestamo() {
		System.out.println("Nombre del usuario: " + nombre);
        System.out.println("Libros rentados:");
        for (Libro libro : libros) {
            System.out.println("- " + libro.getTitulo() + " por " + libro.getAutor() + " ($" + libro.getPrecioDeReemplazo() + ")");
        }
	}
	
	public double calcularTotalDeReemplazo() {
		double total = 0;
        for (Libro libro : libros) {
            total += libro.getPrecioDeReemplazo();
        }
        return total;
	}

}
