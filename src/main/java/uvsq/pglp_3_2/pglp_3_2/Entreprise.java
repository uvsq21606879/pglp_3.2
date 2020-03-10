package uvsq.pglp_3_2.pglp_3_2;

import java.awt.List;
import java.util.ArrayList;

public class Entreprise {
	
	private ArrayList<Employe> listeEmp;
	
	public Entreprise() {
		listeEmp = new ArrayList<Employe>();
	}
	
	public void addEmploye(Employe E) {
		this.listeEmp.add(E);
	}
	
	public double calculSommeSalaires() {
		double Somme;
		Somme=0;
		
		for(Employe E: listeEmp) {
			Somme= Somme+E.calculSalaire();
		}
		return Somme;
	}
	
}