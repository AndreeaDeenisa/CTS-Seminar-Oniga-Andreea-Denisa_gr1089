package clase_strategy;

public class PlataCard implements ModalitatePlata{

	@Override
	public void plateste(double suma) {
		System.out.println("Plata in valoare de "+suma+" ron a fost realizata cu cardul bancar");
		
	}

}
