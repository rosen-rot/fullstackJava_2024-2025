<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contador de visitas</title>
</head>
<body>
	<div class = "container">
		<h1>Contador de Visitas</h1>
    	<p>Número de visitas: ${numVisitas}</p>
    	<form action="/visitas/agregar" method="post">
        	<button type="submit">Agregar Visita</button>
    	</form>
	</div>
</body>
</html>