public class MiTiendaOnline {
   public static void main(String[] args) {

        String mensajeBienvenida = "Bienvenido a nuestra tienda en línea, ";
        String mensajeConfirmacion = ", tu pedido ha sido confirmado";
        String mensajeRechazo = ", lamentablemente el artículo seleccionado está agotado";
        String mensajeMostrarTotal = "El total de tu compra es: $";
      
        // Variables de productos 
        double precioLibro = 15.99;
        double precioCamiseta = 25.50;
        double precioPantalon = 20.99;
        double precioZapatos = 42.50;
    
        // Variables de clientes 
        String cliente1 = "Ana";
        String cliente2 = "Alex";
        String cliente3 = "Miguel";
    
        // Estado de pedidos 
        boolean pedidoConfirmadoCliente1 = true; //Ana
        boolean pedidoConfirmadoCliente2 = true; //Alex
        boolean pedidoConfirmadoCliente3 = true; //Miguel
    
        // INTERACCIÓN DE LA APLICACIÓN
        System.out.println(mensajeBienvenida + cliente1); // Muestra "Bienvenido a nuestra tienda en línea, Ana"
        if(pedidoConfirmadoCliente1){
            System.out.println(cliente1 + " " + mensajeConfirmacion + ". El cliente " + cliente1 + " ha pedido un pantalon.");
        }

        if(pedidoConfirmadoCliente2){
            System.out.println(mensajeBienvenida + cliente2);
            System.out.println(cliente2 + " " + mensajeConfirmacion + ". El cliente " + cliente2 + " ha pedido unos zapatos y un libro.");
            double totalError = precioCamiseta + precioPantalon;
            double totalMiguel = precioLibro + precioZapatos;
            double nuevoTotal = totalMiguel - totalError;
            System.out.println("Hemos recibido la notificación de error en el valor de la compra.");
            System.out.println(mensajeMostrarTotal + nuevoTotal);
        }

          System.out.println(mensajeBienvenida + cliente3); 
            if(pedidoConfirmadoCliente3){
                System.out.println(cliente3 + " " + mensajeConfirmacion + ". El cliente " + cliente3 + " ha 2 pares de zapatos, una camisa y un pantalon.");
                double totalAlex = 2*precioZapatos + precioCamiseta + precioPantalon;
                System.out.println(mensajeMostrarTotal + totalAlex);
        }
   }
}