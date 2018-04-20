<%@page import="java.util.List"%>
<%@page import="dev.sgp.entite.Collaborateur"%>
<%@page language="java" pageEncoding="UTF-8"%> 
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SGP - App</title>

<link rel="stylesheet"
	href="<%=request.getContextPath()%>/css/bootstrap.css">

</head>
<body>
	<div class="container">
		<h1>Nouveau Collaborateur</h1>
		<a href="<%=request.getContextPath()%>/collaborateurs/lister">Retour
			à la liste des collaborateurs</a>
		<form action="<%=request.getContextPath()%>/collaborateurs/ajouter"
			method="post">
			<div class="row">
				<div class="col-4">
					<label for="nom">Nom : </label>
				</div>
				<div class="col-4">
					<input type="text" value="${nom}" required id="nom" name="nom">
				</div>
			</div>
			<div class="row">
				<div class="col-4">
					<label for="prenom">Prénom : </label>
				</div>
				<div class="col-4">
					<input type="text" value="${prenom}" required id="prenom" name="prenom">
				</div>
			</div>
			<div class="row">
				<div class="col-4">
					<label for="dateNaissance">Date de naissance : </label>
				</div>
				<div class="col-4">
					<input type="text" required id="dateNaissance"
						placeholder="yyyy-MM-dd" name="dateNaissance">
				</div>
			</div>
			<div class="row">
				<div class="col-4">
					<label for="adresse">Adresse : </label>
				</div>
				<div class="col-4">
					<input type="text" value="${adresse}" id="adresse" required name="adresse">
				</div>
			</div>
			<div class="row">
				<div class="col-4">
					<label for="secuNumber">Numéro de sécurité sociale : </label>
				</div>
				<div class="col-4">
					<input type="text" value="${secuNumber}" required id="secuNumber" name="secuNumber"
						maxlength="15">
				</div>
			</div>
			<div class="row">
				<div class="col-12">
					<button type="submit">Créer</button>
				</div>
			</div>
		</form>
	</div>

</body>
</html>