package prototype;

public class Tramvai implements MijlocTransport{
	
	private String numeVatman;
	
	public Tramvai(String numeVatman) {
		this.numeVatman=numeVatman;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Tramvaiul este condus de vatmanul ");
		builder.append(numeVatman);
		return builder.toString();
	}


	@Override
	public MijlocTransport copiaza() throws CloneNotSupportedException {
		return (MijlocTransport)super.clone();
	}

}
