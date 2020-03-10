package uvsq.pglp_3_2.pglp_3_2;

import org.junit.Test;

public class TestEmploye {

	@Test
	public void CalculSalaireEmployeTest() {
		Employe E= new Employe("Said",2011);
		double expected=1600;
		assert (E.calculSalaire()==expected);
	}
}
