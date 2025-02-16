package com.canciones.ice.modelos;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="canciones")
public class Cancion {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message="Ingresa el título de la canción.")
	@Size(min = 5, message = "El título debe tener al menos 5 caracteres.")
	private String titulo;
	
	@NotBlank(message="Ingresa el nombre del artista.")
	@Size(min = 3, message = "El artista debe tener al menos 3 caracteres.")
	private String artista;
	
	@NotBlank(message="Ingresa el nombre del album.")
	@Size(min = 3, message = "El álbum debe tener al menos 3 caracteres.")
	private String album;
	
	@NotBlank(message="Ingresa el género.")
	@Size(min = 3, message = "El género debe tener al menos 3 caracteres.")
	private String genero;
	
	@NotBlank(message="Ingresa el idioma.")
	@Size(min = 3, message = "El idioma debe tener al menos 3 caracteres.")
	private String idioma;
	
	@Column(updatable=false) //para que no se actualice
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createdAt;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updatedAt;
	
	@PrePersist //ANTES de crear al usuario 
	protected void onCreate() {
		this.createdAt = new Date(); //DEFAULT CURRENT_TIMESTAMP
	}
	
	@PreUpdate //ANTES de actualizar
	protected void onUpdate() {
		this.updatedAt = new Date(); //DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT TIME_STAMP
	}
	
	public Cancion() {}

	public Long getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getArtista() {
		return artista;
	}

	public String getAlbum() {
		return album;
	}

	public String getGenero() {
		return genero;
	}

	public String getIdioma() {
		return idioma;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
}
