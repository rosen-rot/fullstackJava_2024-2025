package Clases;

import Clases.VueloDomestico;
import Clases.VueloCarga;
import Clases.VueloInternacional;

public class Aplicacion {
    public static void main(String[] args) {

        // Vuelo doméstico
        VueloDomestico vueloDomestico = new VueloDomestico("VD001", "Santiago", "Arica", 2.5, 10.0); // descuento del 10%
        vueloDomestico.mostrarInformacionDeVuelo();
        System.out.println("Precio: $" + vueloDomestico.calcularPrecio());

        // Vuelo internacional
        VueloInternacional vueloInternacional = new VueloInternacional("VI001", "Santiago", "Miami", 8.0, 50.0); // impuesto del 50%
        vueloInternacional.mostrarInformacionDeVuelo();
        System.out.println("Precio: $" + vueloInternacional.calcularPrecio());

        // Vuelo de carga
        VueloCarga vueloCarga = new VueloCarga("VC001", "Santiago", "Madrid", 12.0, 5000.0, 2.5); // 5000 kg a $2.5/kg
        vueloCarga.mostrarInformacionDeVuelo();
        System.out.println("Precio: $" + vueloCarga.calcularPrecio());
    }
}
