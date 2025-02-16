package clases;
public class Aplicacion {
	
    public static void main(String[] args) {
        // Crear préstamos no especificados
        Prestamo prestamo1 = new Prestamo();
        Prestamo prestamo2 = new Prestamo();

        // Crear préstamos personalizados
        Prestamo prestamo3 = new Prestamo("Ana Pérez", true);
        Prestamo prestamo4 = new Prestamo("Luis García", false);
        Prestamo prestamo5 = new Prestamo("María López", true);

        // Crear libros
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 20.5);
        Libro libro2 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 15.0);
        Libro libro3 = new Libro("El Principito", "Antoine de Saint-Exupéry", 10.0);
        Libro libro4 = new Libro("1984", "George Orwell", 18.75);
        Libro libro5 = new Libro("Matar a un ruiseñor", "Harper Lee", 22.0);

        // Agregar libros a los préstamos
        prestamo1.agregarLibro(libro1);
        prestamo1.agregarLibro(libro2);

        prestamo2.agregarLibro(libro3);
        prestamo2.agregarLibro(libro4);

        prestamo3.agregarLibro(libro5);
        prestamo3.agregarLibro(libro1);

        prestamo4.agregarLibro(libro2);
        prestamo4.agregarLibro(libro3);

        prestamo5.agregarLibro(libro4);
        prestamo5.agregarLibro(libro5);

        // Mostrar detalles de cada préstamo
        System.out.println("Detalles de los préstamos:\n");
        prestamo1.mostrarDetallesDelPrestamo();
        System.out.println("Estado: " + prestamo1.mostrarEstatus());
        System.out.println();

        prestamo2.mostrarDetallesDelPrestamo();
        System.out.println("Estado: " + prestamo2.mostrarEstatus());
        System.out.println();

        prestamo3.mostrarDetallesDelPrestamo();
        System.out.println("Estado: " + prestamo3.mostrarEstatus());
        System.out.println();

        prestamo4.mostrarDetallesDelPrestamo();
        System.out.println("Estado: " + prestamo4.mostrarEstatus());
        System.out.println();

        prestamo5.mostrarDetallesDelPrestamo();
        System.out.println("Estado: " + prestamo5.mostrarEstatus());
        System.out.println();
    }
}
