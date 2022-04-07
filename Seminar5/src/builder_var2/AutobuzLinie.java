package builder_var2;

public class AutobuzLinie {
	private int nrLinie;
	private String numeSofer;
	private boolean deschideUsile;
	private boolean areOprire;
	private String textRulat;
	private String model;
	private int nrCalatori;
	
	public AutobuzLinie(int nrLinie, String numeSofer, boolean deschideUsile, boolean areOprire, String textRulat,
			String model, int nrCalatori) {
		super();
		this.nrLinie = nrLinie;
		this.numeSofer = numeSofer;
		this.deschideUsile = deschideUsile;
		this.areOprire = areOprire;
		this.textRulat = textRulat;
		this.model = model;
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
