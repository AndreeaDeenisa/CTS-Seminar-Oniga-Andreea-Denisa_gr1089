package clase_observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subiect {
	protected List<Observer> calatori;

	public Subiect() {
		super();
		this.calatori = new ArrayList<>();
	}
	
	public void adaugaCalator(Observer calator) {
		calatori.add(calator);
	}
	
	public void stergeCalator(Observer calator) {
		calatori.remove(calator);
	}
	
	public abstract void notificareCalatori();
	

}
