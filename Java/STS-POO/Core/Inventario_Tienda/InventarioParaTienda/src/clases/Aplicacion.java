package clases;

public class Aplicacion {
    public static void main(String[] args) {
        TiendaElectronica tienda = new TiendaElectronica();

        Televisor tv = new Televisor("Televisor Samsung", 499.99, 10, 55, "4K UHD");
        computadoraPortatil laptop = new computadoraPortatil("Laptop Nitro 5", 899.99, 10, "ACER", 16, "12345ABC");
        ProductoElectrodomestico plancha = new ProductoElectrodomestico("Plancha Oster", 29.99, 15);

        tienda.agregarProducto(tv);
        tienda.agregarProducto(laptop);
        tienda.agregarProducto(plancha);


        System.out.println("Inventario de la tienda:");
        tienda.mostrarProductos();


        System.out.println("\nRealizando ventas...");
        tienda.realizarVenta("Televisor Samsung");
        tienda.realizarVenta("Laptop Dell");
        tienda.realizarVenta("Plancha Oster");
        tienda.realizarVenta("Plancha Oster");


        System.out.println("\nInventario actualizado:");
        tienda.mostrarProductos();
    }
}
