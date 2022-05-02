package clase_observer;

//problema 11

public class Autobuz extends Subiect{
	private int nrLinie;

	public Autobuz(int nrLinie) {
		super();
		this.nrLinie = nrLinie;
	}
	
	public void notificareCalatori() {
		for(Observer calator:calatori) {
			calator.primesteMesaj("Autobuzul: "+nrLinie+" a plecat de la capat de linie");
		}
	}
}
