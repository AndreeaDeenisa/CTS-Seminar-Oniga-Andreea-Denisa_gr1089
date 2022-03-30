package factoryMethod;

public class Tramvai extends MijlocTransport{
	public Tramvai(String nrInmatriculare) {
		super(nrInmatriculare);
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Tramvai - ");
		builder.append("numar de inmatriculare: ");
		builder.append(this.nrInmatriculare);
		return builder.toString();
	}

}
