package clase;

import java.util.ArrayList;
import java.util.List;

public class Matematica {

	public int suma(int p1, int p2) {
		return p1 + p2;
	}

	public double raport(int numarator, int numitor) {
		if(numitor!=0) {
			return numarator / numitor;
		}else {
			throw new NumitorIncorectExceptie();
		}
		
	}

	public boolean estePar(int numar) {
		return numar % 2 == 0;
	}
	
	//assert null
	//assert not null

	public List<Integer> nNumerePare(int n) {
		List<Integer> lista = new ArrayList<Integer>();
		for (int i = 0; i < n; i++)
			lista.add(i * 2);
		return lista;
	}
}