package main_builder;

import builder.AutobuzBuilder;
import builder.AutobuzLinie;

//obiectele odata create nu mai pot fi modificate
//avem atribute optionale

public class Main {

	public static void main(String[] args) {
		AutobuzBuilder autobuzBuilder = new AutobuzBuilder();
		autobuzBuilder.setNumeSofer("Sofer CTS");
		autobuzBuilder.setTextRulat("END LINE");
		AutobuzLinie autobuzLinie = autobuzBuilder.build();
		
		System.out.println(autobuzLinie);

		
	}

}
