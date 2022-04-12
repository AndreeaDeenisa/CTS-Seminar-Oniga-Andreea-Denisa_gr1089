package clase_proxy;

public class Autobuz implements MijlocTransport{
	private String numeSofer;
	private int nrLocuri;
	private int nrCalatori;
	
	public Autobuz(String numeSofer, int nrLocuri, int nrCalatori) {
		this.numeSofer = numeSofer;
		this.nrLocuri = nrLocuri;
		this.nrCalatori = nrCalatori;
	}

	public int getNrCalatori() {
		return nrCalatori;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Autobuz [numeSofer=");
		builder.append(numeSofer);
		builder.append(", nrLocuri=");
		builder.append(nrLocuri);
		builder.append(", nrCalatori=");
		builder.append(nrCalatori);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public void opresteInStatie() {
		System.out.println("Soferul "+ this.numeSofer 
				+" opreste in statia cu " + this.nrCalatori + " calatori");
		
	}

}
