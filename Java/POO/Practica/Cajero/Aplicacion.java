public class Aplicacion {
    public static void main(String[] args) {
        // Prueba del método retirarDinero
        System.out.println(Cajero.retirarDinero(5000));
        System.out.println(Cajero.retirarDinero(8500));

        // Prueba del método pagarFactura
        System.out.println(Cajero.pagarFactura(1000, 500));
        System.out.println(Cajero.pagarFactura(1000, 1000));
        System.out.println(Cajero.pagarFactura(1000, 1500));

        // Prueba del método cambiarBilletes
        System.out.println(Cajero.cambiarBilletes(2000, 50)); // true
        System.out.println(Cajero.cambiarBilletes(2010, 50)); // false

        // Prueba del método totalDeBilletesYMonedas
        System.out.println(Cajero.totalDeBilletesYMonedas(1999));
        System.out.println(Cajero.totalDeBilletesYMonedas(1234));
    }
}
