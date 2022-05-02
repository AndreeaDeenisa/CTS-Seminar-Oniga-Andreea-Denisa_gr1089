package main_flyweight;

import clase_flyweight.Autobuz;
import clase_flyweight.AutobuzLinie;
import clase_flyweight.FlyweightFactory;

public class Main {

	public static void main(String[] args) {
		Autobuz a1 = new Autobuz("Mercedes", 2020, 20);
        AutobuzLinie a2 = new Autobuz("BMW", 2019, 10);
        AutobuzLinie a3 = new Autobuz("Skoda", 2022, 23);
        AutobuzLinie a4= new Autobuz("Audi", 2021, 40);

        FlyweightFactory factory = new FlyweightFactory();

        a1.descrie(factory.getLinie(168));
        a2.descrie(factory.getLinie(226));
        a3.descrie(factory.getLinie(168));
        a4.descrie(factory.getLinie(137));
	}

}
