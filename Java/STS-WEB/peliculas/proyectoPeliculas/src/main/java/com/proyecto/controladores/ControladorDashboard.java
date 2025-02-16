package com.proyecto.controladores;

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
import org.springframework.web.bind.annotation.RequestParam;

import com.proyecto.modelos.Pelicula;
import com.proyecto.modelos.Usuario;
import com.proyecto.servicios.ServicioPeliculas;
import com.proyecto.servicios.ServicioUsuarios;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class ControladorDashboard {
	
	//Servicios
	@Autowired
	private ServicioPeliculas servicioPelis;
	
	@GetMapping("/dashboard")
	public String dashboard(HttpSession session, Model model) {
		if(session.getAttribute("usuarioEnSesion") == null){
			return "redirect:/";
		}
		
		//Generar la lista con las pelis
        List<Pelicula> peliculas = servicioPelis.todasLasPelis();
        //Enviar esa lista a dashboard
        model.addAttribute("peliculas", peliculas);
		//Enviar esa lista a dashboard

		return "dashboard.jsp";
	}
	
	@GetMapping("/nuevo")
	public String nuevo(@ModelAttribute("nuevaPeli") Pelicula nuevaPeli, /*Genero objeto vacío de peli para llenar con form:form*/
						HttpSession session /*Permite acceder a la sesión*/) {
		
		/*===== Revisar que el usuario haya iniciado sesión =====*/
		if(session.getAttribute("usuarioEnSesion") == null){
			return "redirect:/";
		}
		
		return "nuevo.jsp";
	}
	
	@PostMapping("/crear")
	public String crear(@Valid @ModelAttribute("nuevaPeli") Pelicula nuevaPeli,
						BindingResult result) {
		
		if(result.hasErrors()) {
			return "nuevo.jsp";
		
		} else {
			servicioPelis.guardarPeli(nuevaPeli);
			return "redirect:/dashboard";
		}
		
	}
	
	@GetMapping("/editar/{id}")
	public String editar(@PathVariable("id") Long id, @ModelAttribute("pelicula") Pelicula pelicula, Model model, HttpSession session) {
		if(session.getAttribute("usuarioEnSesion") == null){
			return "redirect:/";
		}
		
		Pelicula peliAEditar = servicioPelis.buscarPeli(id);
		
		//Usuario en sesion
		Usuario usuarioEnSesion = (Usuario)session.getAttribute("usuarioEnSesion");
		if(usuarioEnSesion.getId() != peliAEditar.getCreador().getId()) {
			return "redirect:/dashboard";
		}
		
		model.addAttribute("pelicula", peliAEditar);
		
		return "editar.jsp";
	}
	
	@PutMapping("/actualizar/{id}")
	public String actualizar(@Valid @ModelAttribute("pelicula") Pelicula pelicula, BindingResult result) {
		if(result.hasErrors()) {
			return "editar.jsp";
		
		} else {
			servicioPelis.guardarPeli(pelicula);
			return "redirect:/dashboard";
		}
	}
	
	@DeleteMapping("/borrar/{id}")
	public String borrar(@PathVariable("id") Long id) {
		servicioPelis.borrarPeli(id);
		return "redirect:/dashboard";
	}
	
	@GetMapping("/mostrar/{id}")
	public String mostrar(@PathVariable("id") Long id, Model model, HttpSession session) {
		if(session.getAttribute("usuarioEnSesion") == null){
			return "redirect:/";
		}
		
		Pelicula pelicula = servicioPelis.buscarPeli(id); //Busca la película
		model.addAttribute("pelicula", pelicula); //Envia la pelicula al jsp
		
		 //Enviar el usuario en sesion actualizado
        Usuario usuarioEnSesion = (Usuario)session.getAttribute("usuarioEnSesion");
        Usuario usuario = servicioPelis.buscarUsuario(usuarioEnSesion.getId());
        model.addAttribute("usuario", usuario);
        
        return "mostrar.jsp";
	}
	
	@GetMapping("/agregarFavoritos/{usuarioId}/{peliculaId}")
	    public String agregarFavoritos(@PathVariable("usuarioId") Long usuarioId,
	                                   @PathVariable("peliculaId") Long peliculaId,
	                                   HttpSession session) {

	        //===== Revisar que el usuario haya iniciado sesión =====
	        if(session.getAttribute("usuarioEnSesion") == null){
	            return "redirect:/";
	        }

	        servicioPelis.guardarPeliFavorita(usuarioId, peliculaId);

	        return "redirect:/mostrar/"+peliculaId;

	}

	@GetMapping("/quitarFavoritos/{usuarioId}/{peliculaId}")
	   	public String quitarFavoritos(@PathVariable("usuarioId") Long usuarioId,
	                                   @PathVariable("peliculaId") Long peliculaId,
	                                   HttpSession session) {

	        //===== Revisar que el usuario haya iniciado sesión =====/
	        if(session.getAttribute("usuarioEnSesion") == null){
	            return "redirect:/";
	        }

	        servicioPelis.quitarPeliFavorita(usuarioId, peliculaId);

	        return "redirect:/mostrar/"+peliculaId;

	} 
	
	@GetMapping("/favoritos")
	public String favoritos(HttpSession session,
						    Model model) {
		/*===== Revisar que el usuario haya iniciado sesión =====*/
		if(session.getAttribute("usuarioEnSesion") == null){
			return "redirect:/";
		}
		
		Usuario usuarioEnSesion = (Usuario)session.getAttribute("usuarioEnSesion"); //Obteniendo de la sesión el objeto usuario
		Usuario usuario = servicioPelis.buscarUsuario(usuarioEnSesion.getId());
		model.addAttribute("usuario", usuario);
		
		return "favoritos.jsp";	
	}
	
	@GetMapping("/buscar")
    public String buscar(@RequestParam String titulo, Model model) {
        List<Pelicula> peliculasEncontradas = servicioPelis.buscarPorNombre(titulo);
        model.addAttribute("peliculas", peliculasEncontradas); // Envía resultados a la vista
        return "dashboard.jsp"; // Redirige a la misma vista donde se muestran las películas
	}
}