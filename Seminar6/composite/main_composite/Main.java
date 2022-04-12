package main_composite;

import clase_composite.Autobuz;
import clase_composite.Flota;
import clase_composite.Nod;

public class Main {
    public static void main(String[] args) throws Exception {
        Autobuz autobuz1 = new Autobuz("BMW", "E45", 56);
        Autobuz autobuz2 = new Autobuz("Mercedes", "E34", 60);
        Autobuz autobuz3 = new Autobuz("Otokar", "E3456", 100);
        Autobuz autobuz4 = new Autobuz("BMW", "F345", 80);
        Autobuz autobuz5 = new Autobuz("Mercedes", "F987", 76);
        Autobuz autobuz6 = new Autobuz("Otokar", "F2245", 45);

        Nod flota = new Flota("Autobuze");
        Nod mari = new Flota("Autobuze mari");
        Nod mijlocii = new Flota("Autobuze mijlocii");
        Nod mici = new Flota("Autobuze mici");

        try {
            mici.adaugaNod(autobuz1);
            mici.adaugaNod(autobuz6);

            mijlocii.adaugaNod(autobuz2);
            mijlocii.adaugaNod(autobuz5);

            mari.adaugaNod(autobuz3);
            mari.adaugaNod(autobuz4);

            flota.adaugaNod(mici);
            flota.adaugaNod(mijlocii);
            flota.adaugaNod(mari);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Garantie pentru intreaga flota - " + flota.calculeazaSumaGarantie(10));
        System.out.println("Garantie pentru flota mijlocie - " + mijlocii.calculeazaSumaGarantie(15));
    }
}
