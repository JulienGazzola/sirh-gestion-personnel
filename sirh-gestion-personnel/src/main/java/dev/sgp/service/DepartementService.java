/**
 * 
 */
package dev.sgp.service;

import java.util.ArrayList;
import java.util.List;

import dev.sgp.entite.Departement;

/**
 * @author ETY9
 *
 */
public class DepartementService {
	List<Departement> listeDepartements = new ArrayList<>();
	
	public DepartementService(){
		listeDepartements.add(new Departement("Comptabilite"));
		listeDepartements.add(new Departement("Ressources Humaines"));
		listeDepartements.add(new Departement("Informatique"));
		listeDepartements.add(new Departement("Administratif"));
	}
	
	public List<Departement> listerDepartements() {
		return listeDepartements;
	}

	public void sauvegarderDepartement(Departement departement) {
		listeDepartements.add(departement);
	}
}
