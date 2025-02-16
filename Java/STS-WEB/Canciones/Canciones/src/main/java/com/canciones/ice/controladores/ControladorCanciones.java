package com.canciones.ice.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.canciones.ice.modelos.Cancion;
import com.canciones.ice.servicios.ServicioCanciones;

import jakarta.validation.Valid;


@Controller
public class ControladorCanciones {

	   @Autowired
	    private ServicioCanciones servicio;

	    @GetMapping("/canciones")
	    public String desplegarCanciones(Model model) {
	        List<Cancion> canciones = servicio.obtenerTodasLasCanciones();
	        model.addAttribute("canciones", canciones);
	        return "canciones.jsp";
	    }

	    @GetMapping("/canciones/detalle/{idCancion}")
	    public String desplegarDetalleCancion(@PathVariable Long idCancion, Model model) {
	        Cancion cancion = servicio.obtenerCancionPorId(idCancion);
	        if (cancion == null) {
	            return "redirect:/canciones"; // Redirigir si no existe
	        }
	        model.addAttribute("cancion", cancion);
	        return "detalleCancion.jsp";
	    }

	    // Mostrar formulario de agregar canción
	    @GetMapping("/canciones/formulario/agregar")
	    public String formularioAgregarCancion(Model model) {
	        model.addAttribute("cancion", new Cancion());
	        return "agregarCancion.jsp";
	    }

	    // Procesar adición de nueva canción
	    @PostMapping("/procesa/agregar")
	    public String procesarAgregarCancion(@Valid @ModelAttribute("cancion") Cancion nuevaCancion, 
	                                         BindingResult result, 
	                                         Model model) {
	        if (result.hasErrors()) {
	            model.addAttribute("cancion", nuevaCancion);
	            return "agregarCancion.jsp"; // Vuelve al formulario si hay errores
	        }
	        servicio.agregarCancion(nuevaCancion, result);
	        return "redirect:/canciones";
	    }

	    
	    // Muestra formulario para editar una canción
	    @GetMapping("/formulario/editar/{idCancion}")
	    public String formularioEditarCancion(@ModelAttribute("cancion") Cancion cancion, 
	    									@PathVariable("idCancion") Long idCancion, 
	    									Model model) {
	    	Cancion cancionActual =  servicio.obtenerCancionPorId(idCancion);
	    	model.addAttribute("cancion", cancionActual);
	    	
	    	return "editarCancion.jsp";
	    }
	    
	    @PutMapping("/procesa/editar/{idCancion}")
	    public String procesarEditarCancion(@PathVariable("idCancion") Long idCancion, 
	                                        @Valid @ModelAttribute("cancion") Cancion cancionNueva, 
	                                        BindingResult result, 
	                                        Model model) {
	        if (result.hasErrors()) {
	            model.addAttribute("cancion", cancionNueva);
	            return "editarCancion.jsp";
	        }

	        // Buscar la canción existente
	        Cancion cancionExistente = servicio.obtenerCancionPorId(idCancion);
	        if (cancionExistente == null) {
	            return "redirect:/canciones"; // Evitar error si no se encuentra
	        }

	        // Actualizar solo los valores necesarios
	        cancionExistente.setTitulo(cancionNueva.getTitulo());
	        cancionExistente.setArtista(cancionNueva.getArtista());
	        cancionExistente.setAlbum(cancionNueva.getAlbum());
	        cancionExistente.setGenero(cancionNueva.getGenero());
	        cancionExistente.setIdioma(cancionNueva.getIdioma());

	        // Guardar en la base de datos
	        servicio.actualizarCancion(cancionExistente);

	        return "redirect:/canciones";
	    }

	    @DeleteMapping("/canciones/eliminar/{idCancion}")
	    public String eliminarCancion(@PathVariable("idCancion") Long idCancion) {
	    	this.servicio.eliminarCancion(idCancion);
	    	return "redirect:/canciones";
	    }
}



























