package factoryMethod;

public class AutobuzFactory {
	public MijlocTransport createObject(String nrInmatriculare) {
		return new Autobuz(nrInmatriculare);
	}
}
