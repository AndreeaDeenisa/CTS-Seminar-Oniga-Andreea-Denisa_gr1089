package main;

import factoryMethod.AutobuzFactory;
import factoryMethod.TramvaiFactory;
import factoryMethod.TroleibuzFactory;
import simpleFactory.Factory;
import simpleFactory.MijlocTransport;
import simpleFactory.TipMijlocTransport;
import singleton.Singleton;

public class Main {
	public static void main(String[] args) {
		
		Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1);
        System.out.println(s2);
        
	 	MijlocTransport autobuz = Factory.createObject(TipMijlocTransport.Autobuz, "B 2237A");
        MijlocTransport tramvai = Factory.createObject(TipMijlocTransport.Tramvai, "B 5144C");
        MijlocTransport troleibuz = Factory.createObject(TipMijlocTransport.Troleibuz, "B 299BB");

        System.out.println(autobuz.toString());
        System.out.println(tramvai.toString());
        System.out.println(troleibuz.toString());
        
	}
}
