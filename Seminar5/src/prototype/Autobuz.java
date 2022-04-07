package prototype;

public class Autobuz implements MijlocTransport{

	private String numeSofer;
	
	public Autobuz(String numeSofer) {
		this.numeSofer=numeSofer;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Autobuzul este condus de soferul ");
		builder.append(numeSofer);
		return builder.toString();
	}

//daca nu ne foloseam de clone, trebuia sa avem si constructorul fara param si modificam pe baza lui this
	@Override
	public MijlocTransport copiaza() throws CloneNotSupportedException {
		return (MijlocTransport)super.clone();
	}
	
}
