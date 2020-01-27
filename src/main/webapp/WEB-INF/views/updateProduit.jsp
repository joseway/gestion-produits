<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
		<c:url value="/produits" var="updateUrl" />
		<form:form action="${updateUrl}" method="post" modelAttribute="produit">
			<form:input path="id" type="hidden" value="${produit.id}"/>
			<div class="form-group">
				<label for="nom">Nom</label>
				<form:input path="nom" id="nom" class="form-control"/>
			</div>
			<div class="form-group">
				<label for="prix">Prix</label>
				<form:input path="prix" id="prix" class="form-control"/>
			</div>
			<div class="form-group">
				<label for="categorie">Categorie</label>
				<form:select path="categorie">
					<form:options  selected="${produit.categorie.nom}" items="${categories}" itemValue="id" itemLabel="nom"/>
				</form:select>
			</div>
			<button type="submit" class="btn btn-primary">Modifier</button>
		</form:form>
	</div>
</body>
</html>