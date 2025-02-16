package com.libros.ice.controlador;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class ControladorLibros {
	
	private static HashMap<String, String> listaLibros = new HashMap<String, String>();
	
	public ControladorLibros() {
		listaLibros.put("Odisea", "Homero");	
		listaLibros.put("Don Quijote de la Mancha", "Miguel de Cervantes");
		listaLibros.put("El Código Da Vinci", "Dan Brown");		
		listaLibros.put("Alicia en el país de las maravillas", "Lewis Carroll");
		listaLibros.put("El Hobbit", "J.R.R. Tolkien");	
		listaLibros.put("El alquimista", "Paulo Coelho");	
	}

	@GetMapping("/libros")
	public String obtenerTodosLosLibros(Model model) {
	    model.addAttribute("listaLibros", listaLibros.keySet());
	    return "libros.jsp";
	}


	@GetMapping("/libros/{nombre}")
	public String obtenerInformacionDeLibro(@PathVariable("nombre") String nombreLibro, Model model) {
		
		/*String autor = listaLibros.get(nombreLibro);
		
		model.addAttribute("libro", nombreLibro);
		model.addAttribute("autor", autor);
		
		return "detalleLibro.jsp";*/
		if (listaLibros.containsKey(nombreLibro)) {
			model.addAttribute("nombreLibro", nombreLibro);
			model.addAttribute("nombreAutor", listaLibros.get(nombreLibro));
		} else {
			model.addAttribute("mensaje", "El libro no se encuentra");
		}
		return "detalleLibro.jsp";
	}


	@GetMapping("/libros/formulario")
	public String formularioLibro() {
		return "formularioLibros.jsp";
	}
	

	@PostMapping("/procesa/libro")
	public String procesaLibro(@RequestParam String nombreLibro, 
            				   @RequestParam String nombreAutor) {
			listaLibros.put(nombreLibro, nombreAutor);
			return "redirect:/libros";
	}
}








//model es un objeto de Spring MVC que se usa para enviar datos desde el controlador a la vista (JSP).
//listaLibros es un HashMap<String, String> donde las claves son los nombres de los libros y los valores son los autores.
//listaLibros.keySet() obtiene solo las claves del HashMap, es decir, una colección (Set<String>) de los nombres de los libros.
//addAttribute("libros", listaLibros.keySet()); agrega esa lista de nombres de libros al modelo con la clave "libros", para que pueda ser utilizada en la vista.


//@GetMapping("/{nombre}") → Define que este método responde a la URL "/libros/{nombre}", donde {nombre} es un parámetro dinámico.
//@PathVariable("nombre") String nombre → Extrae el valor de {nombre} desde la URL y lo almacena en la variable nombre.
//if (listaLibros.containsKey(nombre)) → Verifica si el libro existe en el HashMap listaLibros.
//Si el libro existe, agrega su nombre y autor al modelo (model.addAttribute(...)) para pasarlos a la vista detalleLibro.jsp.
//Si el libro no existe, se pasa un mensaje de error al modelo.
//return "detalleLibro"; → Indica que la vista detalleLibro.jsp debe mostrarse.

//@GetMapping("/formulario") → Define que este método responde a la URL "/libros/formulario".
//return "formularioLibros"; → Muestra la vista formularioLibros.jsp, que contiene un formulario para agregar un nuevo libro.

//@PostMapping("/procesa/libro") → Define que este método responde a un formulario que envía datos mediante POST a la URL "/procesa/libro".
//@RequestParam("nombreLibro") String nombreLibro → Captura el valor del campo nombreLibro del formulario.
//@RequestParam("nombreAutor") String nombreAutor → Captura el valor del campo nombreAutor del formulario.
//listaLibros.put(nombreLibro, nombreAutor); → Agrega el nuevo libro al HashMap listaLibros.
//return "redirect:/libros"; → Redirige a la página de lista de libros (/libros), actualizando la vista.