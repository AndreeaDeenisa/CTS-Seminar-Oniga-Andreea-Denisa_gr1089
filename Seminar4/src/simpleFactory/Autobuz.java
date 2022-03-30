package simpleFactory;

public class Autobuz extends MijlocTransport{
	public Autobuz(String nrInmatriculare) {
		super(nrInmatriculare);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Autobuz - ");
		builder.append("numar de inmatriculare: ");
		builder.append(this.nrInmatriculare);
		return builder.toString();
	}
	
}
