package clase_proxy;

public class BiletRezervat implements Bilet{
	private String destinatie;
	private double valoare;
	
	public BiletRezervat(String destinatie, double valoare) {
		super();
		this.destinatie = destinatie;
		this.valoare = valoare;
	}

	public double getValoare() {
		return valoare;
	}

	public String getDestinatie() {
		return destinatie;
	}

	@Override
	public void anuleazaGratuit() {
		System.out.println("Calatorul are anularea gratuita pentru biletul catre destinatia " + this.destinatie + " care are valoarea " + this.valoare + " ron");
	
	}

}
