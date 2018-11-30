package talarmin.cecile.com.fr.tpnote;

import java.util.*;

public class Agence extends Emprunteur{
	
	private List<Employe> employes;
	private String nom;
	
	Agence(String n)
	{
		this.nom = n;
		this.employes = new ArrayList<Employe>();
	}

	public List<Employe> getEmployes() {
		return employes;
	}

	public void setEmployes(List<Employe> employes) {
		this.employes = employes;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

}
