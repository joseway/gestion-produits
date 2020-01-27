<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<link rel="stylesheet" href="<c:url value="/resources/css/main.css" />" />
		<title>${titre}</title>
	</head>
	<body>
		<div class="container">
			<div class="row">
				<div class="col-md-8">
					<h4>Tous les produits</h4>
					<div>
						<table class="table">
							<thead>
								<tr>
									<th>Prix</th>
									<th>Nom</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="prod" items="${produits}">
								<tr>
								
									<td>${prod.prix}</td>
									<td><a href="<c:url value="/produits/${prod.id}" />">${prod.nom}</a></td>
								</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
					
					
				</div>
				<div class="col-md-4">
					<h4>Creer Categorie</h4>
					<div>
						<c:url value="/categories" var="catUrl" />
						<form:form action="${catUrl}" modelAttribute="categorie" method="post">
							<div class="form-group">
								<label for="">Nom</label>
								<form:input path="nom" id="nom" class="form-control"/>
							</div>
							<button class="btn btn-primary" type="submit">Enregistrer</button>
						</form:form>
					</div>
					<div>
						<h4>Creer Produit</h4>
						<c:url value="/produits" var="prodUrl" />
						<form:form modelAttribute="produit" action="${prodUrl}" method="post">
							<div class="form-group">
								<label for="nom">Nom</label>
								<form:input path="nom" id="nom" />
							</div>
							<div class="form-group">
								<label for="prix">Prix</label>
								<form:input path="prix" id="prix" />
							</div>
							<div class="form-group">
								<label for="categorie">Categorie</label>
								<form:select path="categorie">
									<form:options items="${categories}" itemValue="id" itemLabel="nom" />
								</form:select>
							</div>
							<button class="btn btn-primary">Nouveau Produit</button>
						</form:form>
					</div>
				</div>
				
			</div>
		</div>
	
	</body>
</html>