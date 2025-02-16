<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Capitales</title>
</head>
<body>
	<c:choose>
        <c:when test="${not empty error}">
            <h2>${error}</h2>
        </c:when>
        <c:otherwise>
            <h2>La capital de ${pais} es ${capital}.</h2>
        </c:otherwise>
    </c:choose>
</body>
</html>