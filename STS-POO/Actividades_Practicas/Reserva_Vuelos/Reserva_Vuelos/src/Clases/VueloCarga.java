package Clases;

public abstract class VueloCarga extends Vuelo {
    protected double pesoCarga; // en kilogramos
    protected double tarifaKilogramo;

    public VueloCarga(String numeroVuelo, String origen, String destino, double duracion, double pesoCarga, double tarifaKilogramo) {
        super(numeroVuelo, origen, destino, duracion);
        this.pesoCarga = pesoCarga;
        this.tarifaKilogramo = tarifaKilogramo;
    }

    @Override
    public abstract double calcularPrecio();

    @Override
    public abstract void mostrarInformacionDeVuelo();
}
