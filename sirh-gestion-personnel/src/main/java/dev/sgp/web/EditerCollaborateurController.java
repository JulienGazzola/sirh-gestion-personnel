package dev.sgp.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EditerCollaborateurController
 */
public class EditerCollaborateurController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
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
			PrintWriter out = response.getWriter();
			out.write(" Matricule : " + matricule);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String matricule = request.getParameter("matricule");
		String titre = request.getParameter("titre");
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String list = "";
		
		if (matricule == null){
			list += "matricule ";
		}
		if (titre == null){
			list += "titre ";
		}
		if (nom == null){
			list += "nom ";
		}
		if (prenom == null){
			list += "prenom ";
		}
		
		
		if (matricule == null || titre == null
				|| nom == null || prenom == null){
			response.sendError(400, "Les paramètres suivants sont incorrects : " + list);
			
		}
		else{
			PrintWriter out = response.getWriter();
			response.setStatus(201);
			out.write("Creation d'un collaborateur avec les informations suivantes :  Matricule=" + matricule + ",titre=" + titre + 
					",nom=" + nom + ",prenom=" + prenom + ".");
		}
	}

}
