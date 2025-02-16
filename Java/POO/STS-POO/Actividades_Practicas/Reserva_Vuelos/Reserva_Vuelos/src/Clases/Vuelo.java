package Clases;

public abstract class Vuelo {
    protected String numeroVuelo;
    protected String origen;
    protected String destino;
    protected double duracion; // en horas

    public Vuelo(String numeroVuelo, String origen, String destino, double duracion) {
        this.numeroVuelo = numeroVuelo;
        this.origen = origen;
        this.destino = destino;
        this.duracion = duracion;
    }

    public abstract double calcularPrecio();

    public abstract void mostrarInformacionDeVuelo();
    
    //La clase Vuelo será una clase abstracta base para todos los tipos de vuelos. 
    //Contendrá los atributos comunes y los métodos abstractos que deben ser implementados por las subclases.
}
