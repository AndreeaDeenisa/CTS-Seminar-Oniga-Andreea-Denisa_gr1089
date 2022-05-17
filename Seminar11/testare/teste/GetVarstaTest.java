package teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GetVarstaTest {
	
	private Persoana persoana;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void getVarstaRightBicep() {
		persoana = new Persoana("Denisa","6000626410030");
		int varsta = persoana.getVarsta();
		assertEquals(21, varsta);
	}

	@Test
	public void getVarstaBoundary1800() {
		persoana = new Persoana("Denisa","30001626410030");
		int varsta = persoana.getVarsta();
		assertEquals(222, varsta);
	}
	
	@Test
	public void getVarstaBoundary1899() {
		persoana = new Persoana("Denisa","39912316410030");
		int varsta = persoana.getVarsta();
		assertEquals(122, varsta);
	}
	
//	@Test !!daca nu il adnotezi ca test NU va rula
//	public void getVarstaBoundaryZiuaCurenta() {
//		persoana = new Persoana("Denisa","52205176410030");
//		int varsta = persoana.getVarsta();
//		assertEquals(0, varsta);
//	}
	
	@Test
	public void getVarstaBoundaryZiuaUrmatoare() {
		persoana = new Persoana("Denisa","50405106418030");
		int varsta = persoana.getVarsta();
		assertEquals(17, varsta);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void getVarstaErrorConditionVarsta() {
		persoana = new Persoana("Denisa","52205186418030");
		int varsta = persoana.getVarsta();
	}
	
	@Test(expected = NullPointerException.class)
	public void getVarstaErrorConditionCNP() {
		persoana = new Persoana("Denisa",null);
		int varsta = persoana.getVarsta();
	}
	
	@Test(timeout=100)
	public void getVarstaPerformance() {
		persoana = new Persoana("Denisa","6000126410030");
		int varsta = persoana.getVarsta();
	}
	
	//Correct
	@Test
	public void getVarstaOrder() {
		persoana = new Persoana("Dan","5000517030012");
		int varsta = persoana.getVarsta();
		Persoana persoana1 = new Persoana("Denisa","6001626410030");
		assertTrue(persoana.getVarsta()>persoana1.getVarsta());
	}
	
	//data viitoare facem agentie de turism
	//pentru check cnp si pentru metodele din agentie de turism

}
