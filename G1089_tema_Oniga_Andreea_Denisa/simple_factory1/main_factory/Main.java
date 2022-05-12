package main_factory;

import clase_factory.Bilet;
import clase_factory.Factory;
import clase_factory.TipBilet;

public class Main {

	public static void main(String[] args) {
		Bilet business = Factory.creeazaBilet(TipBilet.Business,"Maldive" , "26.05.2022", "7:00", 500);
		Bilet economic = Factory.creeazaBilet(TipBilet.Economic, "Franta", "20.03.2022", "10:00", 60);

		System.out.println(business.toString());
		System.out.println(economic.toString());
	}
}
