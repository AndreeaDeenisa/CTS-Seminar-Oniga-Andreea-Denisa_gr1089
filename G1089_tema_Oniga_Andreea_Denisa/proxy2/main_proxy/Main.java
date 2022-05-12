package main_proxy;

import clase_proxy.BiletRezervat;
import clase_proxy.ProxyBilet;

public class Main {
	
	public static void main(String[] args) {
		BiletRezervat biletRezervat = new BiletRezervat("Franta", 50);
		BiletRezervat biletRezervat2 = new BiletRezervat("Maldive", 1000);
		
		ProxyBilet anulare = new ProxyBilet(biletRezervat);
		anulare.anuleazaGratuit();
		ProxyBilet anulare2 = new ProxyBilet(biletRezervat2);
		anulare2.anuleazaGratuit();

	}

}
