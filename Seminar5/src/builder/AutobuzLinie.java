package builder;

//atribute, constructor, setter,
public class AutobuzLinie {
	private int nrLinie;
	private String numeSofer;
	private boolean deschideUsile;
	private boolean areOprire;
	private String textRulat;
	private String model;
	private int nrCalatori;
	
	public AutobuzLinie() {
		super();
		this.nrLinie = 1;
		this.numeSofer = "Andrei";
		this.deschideUsile = true;
		this.areOprire = true;
		this.textRulat = "Welcome";
		this.model = "Renault";
		this.nrCalatori = 60;
	}

	 void setNrLinie(int nrLinie) {
		this.nrLinie = nrLinie;
	}

	 void setNumeSofer(String numeSofer) {
		this.numeSofer = numeSofer;
	}

	 void setDeschideUsile(boolean deschideUsile) {
		this.deschideUsile = deschideUsile;
	}

	 void setAreOprire(boolean areOprire) {
		this.areOprire = areOprire;
	}

	 void setTextRulat(String textRulat) {
		this.textRulat = textRulat;
	}

	 void setModel(String model) {
		this.model = model;
	}

	 void setNrCalatori(int nrCalatori) {
		this.nrCalatori = nrCalatori;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AutobuzLinie [nrLinie=");
		builder.append(nrLinie);
		builder.append(", numeSofer=");
		builder.append(numeSofer);
		builder.append(", deschideUsile=");
		builder.append(deschideUsile);
		builder.append(", areOprire=");
		builder.append(areOprire);
		builder.append(", textRulat=");
		builder.append(textRulat);
		builder.append(", model=");
		builder.append(model);
		builder.append(", nrCalatori=");
		builder.append(nrCalatori);
		builder.append("]");
		return builder.toString();
	}

}
