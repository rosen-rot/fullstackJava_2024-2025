package com.canciones.ice.servicios;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.canciones.ice.modelos.Cancion;
import com.canciones.ice.repositorios.RepositorioCanciones;


@Service
public class ServicioCanciones {

	@Autowired
	RepositorioCanciones repositorio;
	
	// Método para obtener todas las canciones
    public List<Cancion> obtenerTodasLasCanciones() {
        return repositorio.findAll();
    }
	
	// Método para obtener una canción por ID
    public Cancion obtenerCancionPorId(Long id) {
        return repositorio.findById(id).orElse(null);
    }
    
    //étodo para agregar una canción
    public Cancion agregarCancion(Cancion nuevaCancion, BindingResult result) {
    	if (result.hasErrors()) {
            return null; // Retorna null si hay errores
        }
        return repositorio.save(nuevaCancion); // Guarda la canción y retorna el objeto
    }
    
    //Método para actualizar una canción
    public Cancion actualizarCancion(Cancion cancion) {
    	
    	return repositorio.save(cancion);
    	
    	/*if(repositorio.existsById(cancion.getId())) {
    		return repositorio.save(cancion);
    	}
    	return null;*/
    	
    	//return this.repositorio.save(cancionActualizada); la guarda sin verificar exixtencia
    }
    
    // Método para eliminar canción
    public void eliminarCancion(Long idCancion) {
    	repositorio.deleteById(idCancion);
    }
}
