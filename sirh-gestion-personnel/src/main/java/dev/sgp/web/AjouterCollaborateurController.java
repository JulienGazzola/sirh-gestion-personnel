package dev.sgp.web;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entite.Collaborateur;
import dev.sgp.entite.Departement;
import dev.sgp.error.ErrorAjouter;
import dev.sgp.service.CollaborateurService;
import dev.sgp.service.DepartementService;
import dev.sgp.util.Constantes;

/**
 * Servlet implementation class AjouterCollaborateurController
 */
public class AjouterCollaborateurController extends HttpServlet {
	private CollaborateurService collabService = Constantes.COLLAB_SERVICE;
	private DepartementService departService = Constantes.DEPART_SERVICE;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AjouterCollaborateurController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/views/collab/ajouterCollaborateurs.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		List<Departement> departements = departService.listerDepartements();

		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String matricule = "" + nom + prenom;
		String adresse = request.getParameter("adresse");
		String secuNumber = request.getParameter("secuNumber");
		String emailPro = "" + prenom + "." + nom + "@societe.com";
		String photo = "photo fictive";
		ZonedDateTime dateHeureCreation = LocalDateTime.now().atZone(ZoneId.of("Europe/Paris"));
		
		ErrorAjouter verif = new ErrorAjouter();
		if (verif.valid(request.getParameter("dateNaissance")) == true){
			LocalDate dateNaissance = LocalDate.parse(request.getParameter("dateNaissance"),
					DateTimeFormatter.ofPattern("yyyy-MM-dd"));
			Collaborateur collab = new Collaborateur(matricule, nom, prenom, dateNaissance, adresse, secuNumber, emailPro,
					photo, dateHeureCreation);
			collabService.sauvegarderCollaborateur(collab);
			request.getRequestDispatcher("/collaborateurs/lister").forward(request, response);
			
		}
		else {
			request.setAttribute("nom", nom);
			request.setAttribute("prenom", prenom);
			request.setAttribute("adresse", adresse);
			request.setAttribute("secuNumber", secuNumber);
			request.setAttribute("departements", departements);
			request.getRequestDispatcher("/collaborateurs/lister").forward(request, response);
		}
		
	}

}
