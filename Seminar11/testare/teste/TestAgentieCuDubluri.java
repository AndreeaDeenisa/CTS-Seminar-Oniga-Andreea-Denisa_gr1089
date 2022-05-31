package teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import agentie.AgentieTurism;
import categorii.CategorieUtilizareFake;
import dubluri.PachetDummy;
import dubluri.PachetFake;

public class TestAgentieCuDubluri {
	@Test
	public void testAdaugaPachet() {
		PachetDummy pachetDummy = new PachetDummy();
		AgentieTurism agentieTurism = new AgentieTurism();
		
		agentieTurism.adaugaPachet(pachetDummy);
		assertEquals(1, agentieTurism.getNrPacheteTuristice());
	}
	
	@Test
	public void testCalculeazaPretTotal() {
		PachetFake pachetFake1 = new PachetFake();
		PachetFake pachetFake2 = new PachetFake();
		pachetFake1.setPret(1000);
		pachetFake2.setPret(1500);
		AgentieTurism agentieTurism = new AgentieTurism();
		agentieTurism.adaugaPachet(pachetFake1);
		agentieTurism.adaugaPachet(pachetFake2);
		
		assertEquals(2500, agentieTurism.calculareSumaTotalaPachete(), 0.0001);
	}
	
	@Test
	public void testInverseCalculeazaPretTotal() {
		PachetFake pachetFake1 = new PachetFake();
		PachetFake pachetFake2 = new PachetFake();
		pachetFake1.setPret(1000);
		pachetFake2.setPret(1500);
		
		AgentieTurism agentieTurism = new AgentieTurism();
		agentieTurism.adaugaPachet(pachetFake1);
		agentieTurism.adaugaPachet(pachetFake2);
		
		double total = agentieTurism.calculareSumaTotalaPachete();
		assertEquals(pachetFake1.getPret(), total-pachetFake2.getPret(), 0.0001);
	}
	
	//asta poate sa fie si test de existance
	@Test
	public void testBoundaryCalculeazaPretTotal() {
		AgentieTurism agentieTurism = new AgentieTurism();
		double suma = agentieTurism.calculareSumaTotalaPachete(); //returneaza 0 ca nu am adaugat niciun pachet
		assertEquals(0, suma, 0.01);
	}
	
	//10 pachete 100 de secunde
	@Test(timeout = 100)
	@Category(CategorieUtilizareFake.class)
	public void testPerformanceCalculeazaPretTotal() {
		AgentieTurism agentieTurism = new AgentieTurism();
		for(int i=0;i<100;i++) {
			PachetFake pachetFake = new PachetFake();
			pachetFake.setPret(1000);
			agentieTurism.adaugaPachet(pachetFake);
		}
		double total = agentieTurism.calculareSumaTotalaPachete();
		
	}
}
