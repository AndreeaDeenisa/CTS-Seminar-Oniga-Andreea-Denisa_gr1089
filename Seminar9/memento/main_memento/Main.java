package main_memento;

//pentru revenirea la starile anterioare
//se doreste salvarea unor anumite stari ale obiectelor
//se poate reveni la starile salvate
//problema 13

import clase_memento.Autobaza;
import clase_memento.Autobuz;
import clase_memento.MementoAutobuz;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz("John", 11.7, 21, 2010, "Audi");
        System.out.println(autobuz.toString());
        
        Autobaza autobaza = new Autobaza();
        autobaza.addMemento(autobuz.creeazaMemento());
        
        autobuz.setNumeSofer("Jonny");
        autobuz.setConsumMediu(14.9);
        
        autobaza.addMemento(autobuz.creeazaMemento());
        
        System.out.println(autobuz.toString());
        autobuz.setNumeSofer("Jonny2");
        System.out.println(autobuz.toString());
        autobuz.restaurareMemento(autobaza.getMemento(0));
        System.out.println(autobuz.toString());
        


    }
}
