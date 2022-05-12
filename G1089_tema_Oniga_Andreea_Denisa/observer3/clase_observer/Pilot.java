package clase_observer;


public class Pilot extends Subiect{
	private String numePilot;

	public Pilot(String numePilot) {
		super();
		this.numePilot = numePilot;
	}

	@Override
	public void notificaCalatori() {
		for(Observer calator: calatori) 
			if(calator.getOptiuneActivata() == true) 
				calator.primesteNotificare("Pilotul "+this.numePilot + " a decolat");
		
	}

}
