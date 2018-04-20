/**
 * 
 */
package dev.sgp.entite;

/**
 * @author ETY9
 *
 */
public class Departement {
	private Integer id;
	private String nom;
	private boolean desactivation;

	public Departement(String nom){
		this.nom = nom;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the desactivation
	 */
	public boolean isDesactivation() {
		return desactivation;
	}

	/**
	 * @param desactivation the desactivation to set
	 */
	public void setDesactivation(boolean desactivation) {
		this.desactivation = desactivation;
	}
}
