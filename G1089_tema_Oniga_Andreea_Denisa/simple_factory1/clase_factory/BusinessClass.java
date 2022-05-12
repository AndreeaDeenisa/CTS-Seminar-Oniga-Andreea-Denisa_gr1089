package clase_factory;

public class BusinessClass extends Bilet{

	protected BusinessClass(String data, String ora, String destinatie, double pret) {
		super(data, ora, destinatie, pret);
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Biletul Business Class - ");
		builder.append("cu destinatia: ");
		builder.append(this.destinatie);
		builder.append(", data plecarii: ");
		builder.append(this.data);
		builder.append(", ora zborului: ");
		builder.append(this.ora);
		builder.append(", pretul biletului: ");
		builder.append(this.pret + " euro");
		return builder.toString();
	}

}
