package clase_strategy;

public class PlataSTB implements ModalitatePlata{

	@Override
	public void plateste(double suma) {
		System.out.println("Plata in valoare de "+suma+" ron a fost realizata prin STB");
		
	}

}
