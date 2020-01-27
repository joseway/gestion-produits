<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		<h4>${produit.nom}</h4>
		<p>Prix: ${produit.getPrix()}</p>
		<p>Categorie: ${produit.categorie.nom}</p>
		<p>
			<a href="<c:url value="/produits/update/${produit.id}" />">Modifier</a>
			<a href="<c:url value="/produits/delete/${produit.id}" />">Supprimer</a>
		</p>
	</body>
</html>