package main_observer;

import clase_observer.Calator;
import clase_observer.Observer;
import clase_observer.Pilot;
import clase_observer.Subiect;

public class Main {

	public static void main(String[] args) {
		Subiect pilot = new Pilot("Radu");
		Observer calator = new Calator("Mihai");
		Observer calator2 = new Calator("Andreea");
		Calator calator3 = new Calator("Mara");
		pilot.adaugaCalator(calator);
		pilot.adaugaCalator(calator2);
		pilot.adaugaCalator(calator3);
		calator3.setOptiuneActivata(false);
		pilot.notificaCalatori();
	}
}
