package factoryMethod;


public class MainFactory {

	public static void main(String[] args) {
		MijlocTransport autobuzF = new AutobuzFactory().createObject("IF 1247B");
		System.out.println(autobuzF.toString());

		MijlocTransport troleibuzF = new TroleibuzFactory().createObject("IF 3347A");
		System.out.println(troleibuzF.toString());

		MijlocTransport tramvaiF = new TramvaiFactory().createObject("IF 724AB");
		System.out.println(tramvaiF.toString());
	}
}
