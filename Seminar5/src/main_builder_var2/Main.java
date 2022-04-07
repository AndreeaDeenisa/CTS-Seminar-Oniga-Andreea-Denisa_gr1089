package main_builder_var2;

import builder_var2.AutobuzBuilder;
import builder_var2.AutobuzLinie;

public class Main {

	public static void main(String[] args) {
		AutobuzBuilder autobuzBuilder = new AutobuzBuilder();
		autobuzBuilder.setAreOprire(false).setNrLinie(25);
		
		AutobuzLinie autobuzLinie = autobuzBuilder.build();
		System.out.println(autobuzLinie.toString());
	}

}
