package teste;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import clase.Matematica;
import clase.NumitorIncorectExceptie;

class MatematicaTest {

	@Test
	public void testSumaRight() {
		Matematica matematica = new Matematica();
		int rezObtinut = matematica.suma(2, 8);
		assertEquals(10, rezObtinut);
	}
	
	//1143 + 4345
	@Test
	public void testSumaInverse() {
		Matematica matematica = new Matematica();
		int rezObtinut = matematica.suma(1143, 4345);
		assertEquals(1143, rezObtinut-4345);
	}
	
	@Test
	public void testRaportRight() {
		Matematica matematica = new Matematica();
		assertEquals(6, matematica.raport(24, 4), 0.01);
	}
	
	@Test 
	public void testRaportBounderyInf() {
		Matematica matematica = new Matematica();
		assertEquals(-10, matematica.raport(10, -1), 0.01); 
	}
	
	@Test 
	public void testRaportBounderySup() {
		Matematica matematica = new Matematica();
		assertEquals(10, matematica.raport(10, 1), "Metoda raport afiseaza gresit"); 
	}
	
//	@Test
//	public void testRaportExceptie() {
//		Matematica matematica = new Matematica();
//		
//		
//		assertThrows(NumitorIncorectExceptie.class, new org.junit.jupiter.api.function.Executable() {
//			
//			@Override
//			public void execute() throws Throwable {
//				matematica.raport(3, 0);
//				
//			}
//		});
//
//	}
	
	
	
	@Test
	void testSumaPerformance() {
		Matematica matematica = new Matematica();
		assertTimeout(Duration.ofMillis(100), new Executable() {
			@Override
			public void execute() throws Throwable{
				
			}
		});
	}

}
