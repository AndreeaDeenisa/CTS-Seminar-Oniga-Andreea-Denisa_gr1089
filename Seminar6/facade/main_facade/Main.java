package main_facade;

import clase.Facade;
import clase.Autobuz;

public class Main {
	public static void main(String[] args) {
		Autobuz autobuz = new Autobuz();
		Facade.deschideUsi(autobuz);
		Facade.lasaLiberUsi(autobuz);

	}

}
