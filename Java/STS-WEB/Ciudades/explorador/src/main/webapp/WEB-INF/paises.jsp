<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Paises</title>
</head>
<body>
	<h1>Lista de Países y sus Capitales</h1>
    <ul>
        <c:forEach var="entry" items="${paises}">
            <li><a href="/paises/${entry.key}">${entry.key}</a></li>
        </c:forEach>
    </ul>
</body>
</html>