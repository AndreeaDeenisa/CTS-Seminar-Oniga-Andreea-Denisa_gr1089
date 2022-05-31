package teste;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import agentie.PachetTuristic;
import categorii.CategorieUtilizareFake;
import dubluri.PersoanaFake;

public class TestPachetTuristic {
	
	@Test
	@Category(CategorieUtilizareFake.class)
	public void testPoateRezervaVarstaEligibila() {
		PersoanaFake persoana = new PersoanaFake();
		PachetTuristic pachetTuristic = new PachetTuristic(persoana, "Saint Tropez", 3500.0);
		persoana.setValoareGetVarsta(22);
		assertTrue(pachetTuristic.poateRezerva());
	}
	
	@Test
	@Category(CategorieUtilizareFake.class)
	public void testPoateRezervaVarstaMaiMica() {
		PersoanaFake persoana = new PersoanaFake();
		PachetTuristic pachetTuristic = new PachetTuristic(persoana, "Saint Tropez", 3500.0);
		persoana.setValoareGetVarsta(16);
		assertFalse(pachetTuristic.poateRezerva());
	}
	
	@Test
	@Category(CategorieUtilizareFake.class)
	public void testAplicaDiscountVarstnici() {
		PersoanaFake persoana = new PersoanaFake();
		PachetTuristic pachetTuristic = new PachetTuristic(persoana, "Saint Tropez", 3500.0);
		persoana.setValoareGetVarsta(65);
		pachetTuristic.aplicaDiscountVarstnici(10);
		assertEquals(3150.0, pachetTuristic.getPret(), 0.01);
	}
	
	@Test
	@Category(CategorieUtilizareFake.class)
	public void testNuAplicaDiscount() {
		PersoanaFake persoana = new PersoanaFake();
		PachetTuristic pachetTuristic = new PachetTuristic(persoana, "Saint Tropez", 3500.0);
		persoana.setValoareGetVarsta(25);
		pachetTuristic.aplicaDiscountVarstnici(10);
		assertEquals(3500.0, pachetTuristic.getPret(), 0.01);
	}

}
