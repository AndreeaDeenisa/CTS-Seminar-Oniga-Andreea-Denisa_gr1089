package clase_strategy;

public class Validator{

	private ModalitatePlata modalitatePlata;
	private double pret;
	
	public Validator(double pret) {
		this.pret = pret;
		modalitatePlata = new PlataSTB();
	}
	
	public void setModalitatePlata(ModalitatePlata modalitatePlata) {
		this.modalitatePlata = modalitatePlata;
	}

	public void valideazaCalatorie() {
		this.modalitatePlata.plateste(this.pret);
	}

	

}
