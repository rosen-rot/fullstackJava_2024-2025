package Clases;

public abstract class VueloDomestico extends Vuelo {
    protected double descuento; // en porcentaje

    public VueloDomestico(String numeroVuelo, String origen, String destino, double duracion, double descuento) {
        super(numeroVuelo, origen, destino, duracion);
        this.descuento = descuento;
    }

    @Override
    public double calcularPrecio() {
    	double precioBase = 100.0 * duracion;
        return precioBase - (precioBase * descuento / 100.0);
    }

    @Override
    public void mostrarInformacionDeVuelo() {
    	 System.out.println("Vuelo Doméstico:");
         System.out.println("Número de Vuelo: " + numeroVuelo);
         System.out.println("Origen: " + origen);
         System.out.println("Destino: " + destino);
         System.out.println("Duración: " + duracion + " horas");
         System.out.println("Descuento: " + descuento + "%");
    }
}

