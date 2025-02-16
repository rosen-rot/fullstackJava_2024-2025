<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page isErrorPage="true" %>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Editar Canción</title>
    <link rel="stylesheet" href="/css/styles.css"> <!-- Enlace a CSS si lo necesitas -->
</head>
<body>

    <h2>Editar Canción</h2>

    <form:form action="/procesa/editar/${cancion.id}" method="POST" modelAttribute="cancion">
        
        <!-- Campo oculto para simular método PUT -->
        <input type="hidden" name="_method" value="PUT">

        <label for="titulo">Título:</label>
        <form:input path="titulo" id="titulo" />
        <form:errors path="titulo" cssClass="error" />
        <br>

        <label for="artista">Artista:</label>
        <form:input path="artista" id="artista" />
        <form:errors path="artista" cssClass="error" />
        <br>
        
		<label for="album">Album:</label>
        <form:input path="album" id="album" />
        <form:errors path="album" cssClass="error" />
        <br>        

        <label for="genero">Género:</label>
        <form:input path="genero" id="genero" />
        <form:errors path="genero" cssClass="error" />
        <br>
        
        <label for="idioma">Idioma:</label>
        <form:input path="idioma" id="idioma" />
        <form:errors path="idioma" cssClass="error" />
        <br>

        <button type="submit">Actualizar</button>
        <a href="/canciones">Cancelar</a>

    </form:form>

</body>
</html>
