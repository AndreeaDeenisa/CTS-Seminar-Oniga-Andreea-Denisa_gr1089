package teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PersoanaTest {
	private Persoana persoana;

	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void getSexRightBicep() {
		persoana = new Persoana("Denisa","2345678923456");
		String sex = persoana.getSex();
		assertEquals("F", sex);
	}
	
	@Test
	public void getSexBoundary() {
		persoana = new Persoana("Stefan","5345678923456");
		String sex = persoana.getSex();
		assertEquals("M", sex);
	}

	@Test
	public void getSexCrossCheck() {
		persoana = new Persoana("Stefan","5345678923456");
		int primaCifra = persoana.CNP.charAt(0);
		String sex = persoana.getSex();
		int cifra;
		if(sex=="M") {
			cifra = 1;
		}else {
			cifra = 2;
		}
		assertEquals(cifra % 2 == 1, primaCifra % 2 == 1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void getSexErrorCondition() {
		persoana = new Persoana("Stefan","0345678923456");
		String sex = persoana.getSex();
	}
	
	@Test(timeout=100)
	public void getSexPerformance() {
		persoana = new Persoana("Stefan","6345678923456");
		String sex = persoana.getSex();
	}
	
	//Correct
	@Test
	public void getSexOutputFormat() {
		persoana = new Persoana("Stefan","5345678923456");
		String sex = persoana.getSex();
		assertEquals(1, sex.length());
	}
	
	//1800-1899 , 1900-1999 , 2000-2022 -> 3 intervale
	@Test
	public void getSexRangeBetween1800and1899() {
		persoana = new Persoana("Stefan","3345678923456");
		String sex = persoana.getSex();
		assertEquals("M", sex);
	}
	
	@Test(expected = NullPointerException.class)
	public void getSexExistence() {
		persoana = new Persoana("Stefan",null);
		String sex = persoana.getSex();
	}
	
	
	
}
