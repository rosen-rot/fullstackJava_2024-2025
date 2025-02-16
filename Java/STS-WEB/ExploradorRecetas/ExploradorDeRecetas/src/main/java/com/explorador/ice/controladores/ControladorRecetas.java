package com.explorador.ice.controladores;


import java.util.HashMap; 

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ControladorRecetas {

	private static String[] listaRecetas = {"Pizza", "Espagueti", "Lasaña"};
	private static HashMap<String, String []> recetasConIngredientes = new HashMap<String, String[]>();
	
	public ControladorRecetas() {
		String [] pizza = {"Pan", "Salsa de tomate", "Queso", "Pepperoni"};
		recetasConIngredientes.put("Pizza", pizza);
		String [] espagueti = {"Pasta", "Salsa de tomate", "Carne molida", "Queso parmesano"};
		recetasConIngredientes.put("Espagueti", espagueti);
		String [] lasaña = {"Pasta", "Salsa de tomate", "Queso", "Albahaca", "Espinaca", "Champiñones"};
		recetasConIngredientes.put("Lasaña", lasaña);
	}
	
	/*¿Por qué usamos Model?
	Cuando un usuario accede a la ruta /recetas, el controlador debe enviar la lista de recetas a la vista recetas.jsp, 
	para que esta pueda mostrarlas. Sin embargo, las vistas JSP no tienen acceso directo a las variables del controlador. 
	Aquí es donde entra el objeto Model.

	¿Qué hace Model?
	El método model.addAttribute("listaRecetas", listaRecetas); agrega la lista de recetas al Model con el nombre "listaRecetas". 
	Luego, en la vista recetas.jsp, podemos acceder a esta variable usando JSTL (${listaRecetas}) y mostrarla dinámicamente.*/
	
	// Método para mostrar todas las recetas en la ruta /recetas
	@GetMapping("/recetas")
	public String recetas(Model model) {
		model.addAttribute("listaRecetas", listaRecetas);
        return "recetas.jsp";
	}
	
	/*La anotación @PathVariable se usa en Spring Boot para extraer valores dinámicos de la URL y pasarlos como parámetros a un método del controlador. 
	 * En este caso, el método obtenerRecetaPorNombre utiliza @PathVariable para obtener el nombre de la receta desde la URL y buscar sus ingredientes.*/
	
	// Método para mostrar detalles de una receta en /recetas/{nombre}
	@GetMapping("/recetas/{nombre}")
	public String obtenerRecetasPorNombre(@PathVariable String nombre, Model model) {
		if (recetasConIngredientes.containsKey(nombre)) {
            model.addAttribute("nombreReceta", nombre);
            model.addAttribute("ingredientes", recetasConIngredientes.get(nombre));
        } else {
            model.addAttribute("mensaje", "La receta no se encuentra en nuestra lista.");
        }
        return "detalleReceta.jsp";
	}
}
