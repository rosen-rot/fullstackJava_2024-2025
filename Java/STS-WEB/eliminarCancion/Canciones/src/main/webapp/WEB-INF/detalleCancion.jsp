<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page isErrorPage="true" %>

<!DOCTYPE html>

<html>
<head>
    <title>Detalle de Canción</title>
</head>
<body>
    <div class="container">
        <c:choose>
            <c:when test="${not empty cancion}">
                <h1>Detalle de Canción</h1>
                <p><strong>Título:</strong> ${cancion.titulo}</p>
                <p><strong>Artista:</strong> ${cancion.artista}</p>
                <p><strong>Álbum:</strong> ${cancion.album}</p>
                <p><strong>Género:</strong> ${cancion.genero}</p>
                <p><strong>Idioma:</strong> ${cancion.idioma}</p>
                <p><strong>Fecha de Creación:</strong> 
                    <fmt:formatDate value="${cancion.createdAt}" pattern="dd/MM/yyyy HH:mm:ss"/>
                </p>
                <p><strong>Fecha de Actualización:</strong> 
                    <fmt:formatDate value="${cancion.updatedAt}" pattern="dd/MM/yyyy HH:mm:ss"/>
                </p>

                <div class="button-container">
                    <!-- Botón para editar canción -->
                    <a class="btn btn-edit" href="/formulario/editar/${cancion.id}">Editar Canción</a>

                    <!-- Formulario para eliminar canción -->
                    <form action="/canciones/eliminar/${cancion.id}" method="post" style="display: inline;">
    					<input type="hidden" name="_method" value="delete">
    					<button type="submit" class="btn btn-delete" onclick="return confirm('¿Estás seguro de eliminar esta canción?');">
       						 Eliminar Canción
    					</button>
					</form>

                    <!-- Botón para volver -->
                    <a class="btn btn-back" href="/canciones">Volver a lista de canciones</a>
                </div>

            </c:when>
            <c:otherwise>
                <h1>Canción no encontrada</h1>
                <p>Lo sentimos, la canción que buscas no está disponible.</p>
                <div class="button-container">
                    <a class="btn btn-back" href="/canciones">Volver a lista de canciones</a>
                </div>
            </c:otherwise>
        </c:choose>
    </div>
</body>
</html>