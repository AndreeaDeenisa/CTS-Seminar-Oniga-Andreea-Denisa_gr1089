package clase_factory;

public abstract class Bilet {
	protected String data;
	protected String ora;
	protected String destinatie;
	protected double pret;
	
	protected Bilet(String data, String ora, String destinatie, double pret) {
		this.data = data;
		this.ora = ora;
		this.destinatie = destinatie;
		this.pret = pret;
	}
	
}
