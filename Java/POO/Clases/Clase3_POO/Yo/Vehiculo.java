//En POO, una clase es una plantilla que define cómo serán los objetos que creemos basados en ella.
public class Vehiculo{ /*Aquí definimos la clase Vehiculo. Es como un molde para crear diferentes vehículos, con características (atributos) y comportamientos (métodos). */

    //atributos
    private int anio;
    private String marca;
    private String modelo;
    private String color;
    private int ruedas;
     //Usamos private para aplicar encapsulamiento, lo que significa que estas propiedades solo pueden ser modificadas de forma controlada mediante métodos.

    //Constructor: inicializa la instancia
    public Vehiculo(int anio, String marca, String modelo, String color, int ruedas){
    /*El constructor es un método especial que se llama cuando creamos un nuevo objeto de la clase.
    this.marca = marca; asigna el valor recibido como parámetro al atributo marca de la clase. */
        this.anio = anio;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.ruedas = ruedas;
    }

    //Estos métodos permiten leer o modificar los valores de los atributos respetando el principio de encapsulamiento.
    //Getter (getMarca): Permite obtener el valor de marca.
    //Setter (setMarca): Permite modificar el valor de marca
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public void mostrarInfo() {
        System.out.println("Año: " + anio);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
        System.out.println("Ruedas: " + ruedas);
    }
}
