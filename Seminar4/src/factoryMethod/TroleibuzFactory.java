package factoryMethod;

public class TroleibuzFactory implements Factory{
	public MijlocTransport createObject(String nrInmatriculare) {
		return new Troleibuz(nrInmatriculare);
	}
}
