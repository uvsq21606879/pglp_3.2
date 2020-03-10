package uvsq.pglp_3_2.pglp_3_2;

import java.util.Calendar;

public class Vendeur extends Employe{

	private double commission;
	
	public Vendeur(String nom, int annee) {
		super(nom, annee);
		this.commission=0;
	}
	
	@Override
	public double calculSalaire() {
		return super.calculSalaire()+commission;
	}
	
	public void setCommission(double commission) {
		this.commission=commission;
	}

}
