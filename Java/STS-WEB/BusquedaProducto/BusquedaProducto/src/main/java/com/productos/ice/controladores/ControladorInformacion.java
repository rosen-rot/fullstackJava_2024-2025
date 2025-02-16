package com.productos.ice.controladores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorInformacion {
	
	private static String listaProductos [] = {"iPhone", "Samsung", "Huawei", "Windows Phone"};
	private static Double listaPrecios [] = {49.99, 35.99, 60.99, 25.99};
	
	@GetMapping("/productos")
    public String buscarPrecioProducto(@RequestParam String nombre) {
        for (int i = 0; i < listaProductos.length; i++) {
            if (listaProductos[i].equalsIgnoreCase(nombre)) {
                return "El precio del " + listaProductos[i] + " es de $" + listaPrecios[i];
            }
        }
        return "El producto '" + nombre + "' no se encuentra en nuestra lista.";
    }
}
