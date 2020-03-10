package uvsq.pglp_3_2.pglp_3_2;

import java.util.*;

public class Employe {
	private final String nom;
	private final int annee_arrivee;
	
	public Employe(String nom,int annee) {
		this.nom = nom;
		this.annee_arrivee=annee;
	}
	
	public double calculSalaire() {
		Calendar c = Calendar.getInstance();
		int annee_courante = c.get(Calendar.YEAR);
		return 1500+20*(annee_courante-annee_arrivee);
	}

}
