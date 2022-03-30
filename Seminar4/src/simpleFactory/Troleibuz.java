package simpleFactory;

public class Troleibuz extends MijlocTransport {
	public Troleibuz(String nrInmatriculare) {
		super(nrInmatriculare);
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Troleibuz - ");
		builder.append("numar de inmatriculare: ");
		builder.append(this.nrInmatriculare);
		return builder.toString();
	}
}
