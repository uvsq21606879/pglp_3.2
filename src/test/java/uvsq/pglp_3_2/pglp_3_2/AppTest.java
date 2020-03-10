package uvsq.pglp_3_2.pglp_3_2;


/**
 * Unit test for simple App.
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {
	
	Employe emp;
	Vendeur ven;
	Manager man; 
	Entreprise ent;
	@Test
	public final void test_salaireEmp() {
		emp = new Employe("Wily",2020);
	    assertTrue(emp.calculSalaire()==1500);
	}

	@Test
	public void testNotNull() {
		emp = new Employe("kamy",1500);
		assertNotNull(emp);
	}
	
	
	@Test
	public void CalculSalaireVendeurTest() {
		Vendeur ven= new Vendeur("Raba",2015);
		ven.setCommission(150.5);
		double expected=1750.5;
		assertEquals(expected,ven.calculSalaire(),0);
	}
	
	@Test
	public final void test_salaire_Man() {
		man = new Manager("Vald",2015);
		man.setNbSubalternes(5);
	    assertTrue(man.calculSalaire()==2100);
	}
	
	

}
