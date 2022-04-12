package clase;

import clase.Autobuz;

public class Facade {
	public static void deschideUsi(Autobuz autobuz) {
		autobuz.deschideUsaFata();
		autobuz.deschideUsaSpate();
		autobuz.deschideUsaMijloc();
	}
	
	public static void lasaLiberUsi(Autobuz autobuz) {
		autobuz.lasaLiberUsaFata();
		autobuz.lasaLiberUsaSpate();
		autobuz.lasaLiberUsaMijloc();
	}
}
