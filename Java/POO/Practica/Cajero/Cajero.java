import java.util.Date;
import java.text.SimpleDateFormat;

public class Cajero{

    //Metodo estatico retirarDinero
    public static String retirarDinero(double cantidad){
        if(cantidad > 8000){
            return "Estás tratando de retirar mucho dinero, el límite es $8000.";
        } else{
            return "Retiraste exitosamente la cantidad de $" + cantidad;
        }
    }

    public static String pagarFactura(double totalFactura, double cantidadPagada){
        Date fechaActual = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        String fecha = formatoFecha.format(fechaActual);

        if(cantidadPagada < totalFactura){
            double restante = totalFactura - cantidadPagada;
            return "El día de " + fecha + "pagaste " + cantidadPagada + " aún te hacen falta " + restante;
        }
        else if( totalFactura == cantidadPagada){
            return "Gracias por tu pago completo el día de " + fecha;
        }
        else{
            double cambio = cantidadPagada - totalFactura;
            return "Gracias por tu pago el día de " + fecha + ", tu cambio es de $" + cambio;
        }
    }

    public static Boolean cambiarBilletes(int cantidad, int denominacion){
        //Calcula el residuo de dividir la cantidad entre la denominación. Si el residuo es 0, significa que el cambio es posible y devuelve true. De lo contrario, devuelve false.
        return cantidad % denominacion == 0;
    }

    public static String totalDeBilletesYMonedas(int cantidad) {
        /*Define un arreglo con las denominaciones disponibles: billetes y monedas.
        Usa un bucle para iterar sobre las denominaciones:
        Calcula cuántos billetes/monedas de esa denominación caben en la cantidad.
        Actualiza el resto de la cantidad que falta por cambiar.
        Construye un mensaje indicando el número de billetes/monedas de cada denominación necesaria.
        Devuelve el mensaje como un String. */
        
        int[] denominaciones = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int[] cantidades = new int[denominaciones.length];

        for (int i = 0; i < denominaciones.length; i++) {
            cantidades[i] = cantidad / denominaciones[i];
            cantidad %= denominaciones[i];
        }

        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < denominaciones.length; i++) {
            if (cantidades[i] > 0) {
                resultado.append(cantidades[i]).append(" ").append(denominaciones[i] >= 20 ? "billetes" : "monedas").append(" de ").append(denominaciones[i]).append(", ");
            }
        }

        // Eliminar la última coma y espacio
        if (resultado.length() > 0) {
            resultado.setLength(resultado.length() - 2);
        }

        return resultado.toString();
    }
}