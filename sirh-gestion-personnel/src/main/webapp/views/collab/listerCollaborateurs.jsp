<%@page import="java.util.List"%>
<%@page import="dev.sgp.entite.Collaborateur"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SGP - App</title>

<link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap.css">
</head>
<body>
	<h1>Les collaborateurs</h1>
	<a href="<%=request.getContextPath()%>/collaborateurs/ajouter">Ajouter un collaborateur</a>
	<ul>
		<%
			List<Collaborateur> listeCollab = (List<Collaborateur>) request.getAttribute("collaborateurs");
			for (Collaborateur collab : listeCollab) {
		%>
		<li>
			<div class="container">
				<div class="card">
					<div class="card-title">Nom <%=collab.getNom()%> Prénom <%=collab.getPrenom()%></div>
					<div class="card-body">
						<div class="float-left"><img src=<%=collab.getPhoto() %> alt="Photo Profil"></div>
						<div class="col-8">	Matricule : <%=collab.getMatricule() %></br>
											Adresse : <%=collab.getAdresse() %></br>
											Email : <%=collab.getEmailPro() %></br>
											Numero de sécurité sociale : <%=collab.getSecuNumber() %></br></div>				
					</div>
					<div class="row justify-content-end"><button type="button">Editer</button></div>
				</div>
		
			</div>
			
			</li>
		<%
			}
		%>
	</ul>
</body>
</html>