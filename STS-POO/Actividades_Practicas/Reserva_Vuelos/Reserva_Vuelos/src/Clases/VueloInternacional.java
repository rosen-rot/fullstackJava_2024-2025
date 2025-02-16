package Clases;

public abstract class VueloInternacional extends Vuelo {
    protected double impuestoInternacional;

    public VueloInternacional(String numeroVuelo, String origen, String destino, double duracion, double impuestoInternacional) {
        super(numeroVuelo, origen, destino, duracion);
        this.impuestoInternacional = impuestoInternacional;
    }

    @Override
    public abstract double calcularPrecio();

    @Override
    public abstract void mostrarInformacionDeVuelo();
}

