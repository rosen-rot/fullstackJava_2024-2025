package com.proyecto.repositorios;

import java.util.List; 

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.modelos.Pelicula;

@Repository //Encargado de las consultas
public interface RepositorioPeliculas extends CrudRepository<Pelicula, Long> {
	
	List<Pelicula> findAll(); //SELECT * FROM peliculas;
	
	//SELECT * FROM peliculas ORDER BY titulo ASC;
	List<Pelicula> findAllByOrderByTituloAsc();
	
	List<Pelicula> findAllByOrderByAnioDesc();
	
	//SELECT * FROM peliculas WHERE titulo LIKE "%palabra%"
	List<Pelicula> findByTituloContaining(String palabra);
	
	//SELECT * FROM peliculas WHERE nombre LIKE %titulo%
	List<Pelicula> findByTituloContainingIgnoreCase(String titulo);
	

}