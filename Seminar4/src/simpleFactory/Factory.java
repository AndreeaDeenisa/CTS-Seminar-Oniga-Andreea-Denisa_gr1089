package simpleFactory;

public class Factory {
	public static MijlocTransport createObject(TipMijlocTransport tipmijlocTransport, String numarInmatriculare) {
        switch (tipmijlocTransport) {
            case Tramvai:
                return new Tramvai(numarInmatriculare);
            case Autobuz:
                return new Autobuz(numarInmatriculare);
            case Troleibuz:
                return new Troleibuz(numarInmatriculare);
            default:
                return null;
        }
    }

}
