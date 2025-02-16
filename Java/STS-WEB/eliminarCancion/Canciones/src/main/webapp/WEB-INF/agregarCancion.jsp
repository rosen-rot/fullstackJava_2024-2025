<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Agregar Canción</title>
</head>
<body>
    <h1>Agregar Nueva Canción</h1>
    <form:form modelAttribute="cancion" action="/procesa/agregar" method="post">

        <label>Título:</label>
        <form:input path="titulo" />
        <form:errors path="titulo" cssClass="error" />
        <br/>

        <label>Artista:</label>
        <form:input path="artista" />
        <form:errors path="artista" cssClass="error" />
        <br/>

        <label>Álbum:</label>
        <form:input path="album" />
        <form:errors path="album" cssClass="error" />
        <br/>

        <label>Género:</label>
        <form:input path="genero" />
        <form:errors path="genero" cssClass="error" />
        <br/>

        <label>Idioma:</label>
        <form:input path="idioma" />
        <form:errors path="idioma" cssClass="error" />
        <br/>

        <input type="submit" value="Agregar Canción" />
    </form:form>
    <br/>
    <a href="/canciones">Volver a lista de canciones</a>
</html>