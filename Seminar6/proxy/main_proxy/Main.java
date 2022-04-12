package main_proxy;

import clase_proxy.Autobuz;
import clase_proxy.AutobuzDeNoapte;

public class Main {

	public static void main(String[] args) {
		Autobuz autobuz = new Autobuz("Mircea", 25, 3);
		autobuz.opresteInStatie();
		Autobuz autobuz2 = new Autobuz("Razvan", 55, 0);
		autobuz2.opresteInStatie();
		
		AutobuzDeNoapte autobuzDeNoapte = new AutobuzDeNoapte(autobuz);
		autobuzDeNoapte.opresteInStatie();
		AutobuzDeNoapte autobuzDeNoapte2 = new AutobuzDeNoapte(autobuz2);
		autobuzDeNoapte2.opresteInStatie();
	}

}
