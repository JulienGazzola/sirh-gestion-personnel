<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@page import="dev.sgp.entite.Collaborateur"%>
<%@page import="dev.sgp.entite.Departement"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SGP - App</title>
</head>
<body>

	<h1>Editer Collaborateur</h1>

	<a href="<%=request.getContextPath()%>/collaborateurs/lister">Lister
		les collaborateurs</a>
	<%
		Collaborateur collab = (Collaborateur) request.getAttribute("collaborateur");
	%>

	<h4><%=collab.getNom()%>
		<%=collab.getPrenom()%>
		-
		<%=collab.getMatricule()%></h4>
	<div class="container">
		<form action="<%=request.getContextPath()%>/collaborateurs/lister"
			method="post">
			<select class="row" id="monselect">
				<option class="col-4" value="madame">Madame</option>
				<option class="col-4" value="monsieur">Monsieur</option>
				<option class="col-4" value="mademoiselle">Mademoiselle</option>
			</select>

			<div class="row">
				<div class="col-4">
					<label for="nom">Nom : </label>
				</div>
				<div class="col-4">
					<input type="text" value="<%=collab.getNom()%>" required id="nom"
						name="nom">
				</div>
			</div>

			<div class="row">
				<div class="col-4">
					<label for="prenom">Prénom : </label>
				</div>
				<div class="col-4">
					<input type="text" value="<%=collab.getPrenom()%>" required
						id="prenom" name="prenom">
				</div>
			</div>

			<div class="row">
				<div class="col-4">
					<label for="dateNaissance">Date de naissance : </label>
				</div>
				<div class="col-4">
					<input type="text" value="<%=collab.getDateNaissance()%>" required
						id="dateNaissance" name="dateNaissance">
				</div>
			</div>

			<div class="row">
				<div class="col-4">
					<label for="adresse">Adresse : </label>
				</div>
				<div class="col-4">
					<input type="text" value="<%=collab.getAdresse()%>" required
						id="adresse" name="adresse">
				</div>
			</div>

			<div class="row">
				<div class="col-4">
					<label for="secuNumber">Numéro de sécurité sociale : </label>
				</div>
				<div class="col-4">
					<input type="text" value="<%=collab.getSecuNumber()%>" required
						id="secuNumber" name="secuNumber">
				</div>
			</div>

			<div class="row">
				<div class="col-4">
					<label for="telephone">Téléphone : </label>
				</div>
				<div class="col-4">
					<input type="text" value="<%=collab.getTelephone()%>" required
						id="telephone" name="telephone">
				</div>
			</div>

			<div class="row">
				<div class="col-4">
					<label for="bic">Bic : </label>
				</div>
				<div class="col-4">
					<input type="text" value="<%=collab.getBic()%>" required id="bic"
						name="bic">
				</div>
			</div>

			<div class="row">
				<div class="col-4">
					<label for="iban">Iban : </label>
				</div>
				<div class="col-4">
					<input type="text" value="<%=collab.getIban()%>" required id="iban"
						name="iban">
				</div>
			</div>

			<select class="row" id="collabDepartement">
				<%
					List<Departement> listeDepartement = (List<Departement>) request.getAttribute("departements");
					for (Departement departement : listeDepartement) {
				%>
				<option class="col-4" value="<%=departement.getNom()%>"><%=departement.getNom()%></option>
				<%
					}
				%>

		</form>
	</div>
</body>
</html>