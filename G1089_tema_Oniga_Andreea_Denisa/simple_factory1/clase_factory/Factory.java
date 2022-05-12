package clase_factory;

public class Factory {
	public static Bilet creeazaBilet(TipBilet tipBilet, String destinatie, String data, String ora, double pret) {
		switch (tipBilet) {
		case Economic: 
			return new EconomicClass(data, ora, destinatie, pret);
		case Business: 
			return new BusinessClass(data, ora, destinatie, pret);
		default:
			return null;
		}
	}
}
