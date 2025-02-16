package com.proyecto.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.modelos.Pelicula;
import com.proyecto.modelos.Usuario;
import com.proyecto.repositorios.RepositorioPeliculas;
import com.proyecto.repositorios.RepositorioUsuarios;

@Service //La lógica de mi aplicación. Puente controlador y el repo
public class ServicioPeliculas {
	
	@Autowired // Inyección de Dependencias
	private RepositorioPeliculas repoPelis; //Puedo usar cualquier método (consultas) de RepositorioPeliculas
	
	@SuppressWarnings("unused")
	@Autowired
	private RepositorioUsuarios repoUsuarios; //Métodos de RepositorioUsuarios
	
	//Método que regrese todas las pelis
	public List<Pelicula> todasLasPelis() {
		//return repoPelis.findAll(); // return repoPelis.findAllByOrderTituloAsc();
		return repoPelis.findAllByOrderByTituloAsc();
	}
	
	//Método que me guarde: Crea un nuevo registro (si no tiene id). Actualiza registro si tiene id
	public Pelicula guardarPeli(Pelicula pelicula) {
		return repoPelis.save(pelicula);
	}
	
	//Método que busca una peli
	public Pelicula buscarPeli(Long id) {
		return repoPelis.findById(id).orElse(null);
	}
	
	//Método que bore la peli
	public void borrarPeli(Long id) {
		repoPelis.deleteById(id);
	}
	
	//buscar id
	public Usuario buscarUsuario(Long id) {
		return repoUsuarios.findById(id).orElse(null);
	}
	
	public void guardarPeliFavorita(Long usuarioId, Long peliculaId) {
        //Obtener al usuario que quiere agregar a favoritos
        Usuario miUsuario = buscarUsuario(usuarioId);

        //obtener la peli que quiero agregar
        Pelicula miPeli = buscarPeli(peliculaId);

        miUsuario.getPelisFavoritas().add(miPeli);
        repoUsuarios.save(miUsuario);
    }

    public void quitarPeliFavorita(Long usuarioId, Long peliculaId) {

        //Obtener al usuario que quiere agregar a favoritos
        Usuario miUsuario = buscarUsuario(usuarioId);

        //obtener la peli que quiero agregar
        Pelicula miPeli = buscarPeli(peliculaId);

        miUsuario.getPelisFavoritas().remove(miPeli);
        repoUsuarios.save(miUsuario);
    }
    
    // Metodo que busca peliculas por titulo
    public List<Pelicula> buscarPorNombre(String titulo){
    	return repoPelis.findByTituloContainingIgnoreCase(titulo);
    }

}