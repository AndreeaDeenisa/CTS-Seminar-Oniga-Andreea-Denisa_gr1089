package clase_proxy;

public class ProxyBilet implements Bilet{
	private BiletRezervat biletRezervat;
	
	public ProxyBilet(BiletRezervat biletRezervat) {
		super();
		this.biletRezervat = biletRezervat;
	}

	@Override
	public void anuleazaGratuit() {
		if(biletRezervat.getValoare()<100) {
			biletRezervat.anuleazaGratuit();
		}
		else System.out.println("Biletul nu are anulare gratuita, deoarece valoarea biletului spre destinatia " + biletRezervat.getDestinatie() + " cu valoarea "+ biletRezervat.getValoare() + " ron, depaseste 100 de ron");
		
	}

}
