package dev.sgp.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entite.Collaborateur;
import dev.sgp.entite.Departement;
import dev.sgp.service.CollaborateurService;
import dev.sgp.service.DepartementService;
import dev.sgp.util.Constantes;

/**
 * Servlet implementation class EditerCollaborateurController
 */
public class EditerCollaborateurController extends HttpServlet {
	private CollaborateurService collabService = Constantes.COLLAB_SERVICE;
	private DepartementService departService = Constantes.DEPART_SERVICE;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditerCollaborateurController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String matricule = request.getParameter("matricule");
		if (matricule == null){
			response.sendError(400, " Un matricule est attendu");
		}
		else{
			List<Collaborateur> collaborateurs = collabService.listerCollaborateurs();
			List<Departement> departements = departService.listerDepartements();
			for (Collaborateur collab : collaborateurs){
				if (collab.getMatricule().equals(matricule)){
					request.setAttribute("collaborateur", collab);
					request.setAttribute("departements", departements);
					request.getRequestDispatcher("/views/collab/editerCollaborateurs.jsp").forward(request, response);
				}
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
