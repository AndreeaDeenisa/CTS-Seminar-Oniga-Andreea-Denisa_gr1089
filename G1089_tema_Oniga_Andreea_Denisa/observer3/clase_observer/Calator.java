package clase_observer;

public class Calator implements Observer{
	private String nume;
	private boolean optiuneActivata;

	public Calator(String nume) {
		super();
		this.nume = nume;
		this.optiuneActivata = true;
	}

	@Override
	public boolean getOptiuneActivata() {
		return optiuneActivata;
	}

	public void setOptiuneActivata(boolean optiuneActivata) {
		this.optiuneActivata = optiuneActivata;
	}

	@Override
	public void primesteNotificare(String mesaj) {
		if(optiuneActivata == true) {
			System.out.println(nume + " a primit notificare legata de manevrele pilotului: "+mesaj);
		}
		else System.out.println(nume + " nu va primi notificare pentru ca a dezactivat optiunea!");
		
	}

}
