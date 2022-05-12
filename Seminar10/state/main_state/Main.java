package main_state;

import clase_state.Autobuz;

public class Main {
	public static void main(String[] args) {
		
		Autobuz autobuz = new Autobuz(120);
		autobuz.pleacaInCursa();
		autobuz.ieseDinService();
		autobuz.ajungeLaCapatDeLinie();
		autobuz.intraInService();
		autobuz.ajungeLaCapatDeLinie();
		autobuz.ieseDinService();
	}

}
