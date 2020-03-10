package uvsq.pglp_3_2.pglp_3_2;

public class Manager extends Employe {

	private int nb_subalternes;
	
	public Manager(String nom, int annee) {
		super(nom, annee);
		nb_subalternes=1;
	}
	
	@Override
	public double calculSalaire() {
		return super.calculSalaire()+nb_subalternes*100;
	}
	
	public void setNbSubalternes(int nb) {
		this.nb_subalternes=nb;
	}

}
