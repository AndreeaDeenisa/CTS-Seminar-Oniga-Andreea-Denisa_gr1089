package main_template;

import clase_template.Tramvai;
import clase_template.TramvaiProbe;

public class Main {
	public static void main(String[] args) {
		Tramvai tramvai = new Tramvai();
		tramvai.parcurgeTraseu();
		tramvai.parcurgeTraseuInvers();
		
		TramvaiProbe tramvaiProbe = new TramvaiProbe();
		tramvaiProbe.parcurgeTraseu();

	}

}

//mai avem 12,13,15,16