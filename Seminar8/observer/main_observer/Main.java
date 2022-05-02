package main_observer;

import clase_observer.Autobuz;
import clase_observer.Calator;
import clase_observer.Observer;
import clase_observer.Subiect;

public class Main {

	public static void main(String[] args) {
		Subiect autobuz = new Autobuz(32);
		Observer calator1 = new Calator("Mihai");
		Observer calator2 = new Calator("Geroge");
		Observer calator3 = new Calator("Alex");
		
		autobuz.adaugaCalator(calator1);
		autobuz.adaugaCalator(calator2);
		autobuz.notificareCalatori();
		autobuz.adaugaCalator(calator3);
		autobuz.stergeCalator(calator1);
		autobuz.notificareCalatori();

	}

}
