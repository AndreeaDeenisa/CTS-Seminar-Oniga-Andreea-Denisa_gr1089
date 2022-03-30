package factoryMethod;

public class TramvaiFactory implements Factory {
	public MijlocTransport createObject(String nrInmatriculare) {
		return new Tramvai(nrInmatriculare);
	}
}
