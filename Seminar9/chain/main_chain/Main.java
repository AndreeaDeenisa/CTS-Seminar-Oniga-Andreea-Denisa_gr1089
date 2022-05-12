package main_chain;

//lant pentru rezolvarea unei probleme
//atunci cand nu se stie exact cine poate rezolva problema
//exista o lista de posibile obiecte ce pot rezolva problema
//problema 12

import clase_chain.AutobuzHandler;
import clase_chain.MetrouHandler;
import clase_chain.TramvaiHandler;
import clase_chain.TroleibuzHandler;

public class Main {
    public static void main(String[] args) {
    	TroleibuzHandler troleibuzHandler = new TroleibuzHandler(3);
        AutobuzHandler autobuzHandler = new AutobuzHandler(5);
        TramvaiHandler tramvaiHandler = new TramvaiHandler(10);
        MetrouHandler metrouHandler = new MetrouHandler(1000);

        troleibuzHandler.setHandler(autobuzHandler);
        autobuzHandler.setHandler(tramvaiHandler);
        tramvaiHandler.setHandler(metrouHandler);

        troleibuzHandler.afisareMijlocTransport(8);
        troleibuzHandler.afisareMijlocTransport(1);
        troleibuzHandler.afisareMijlocTransport(14);
        troleibuzHandler.afisareMijlocTransport(4);

        //alt oras
        System.out.println("Pentru Cluj: ");
        TroleibuzHandler troleibuzCluj = new TroleibuzHandler(5);
        AutobuzHandler autobuzCluj = new AutobuzHandler(1000);
        TramvaiHandler tramvaiCluj = new TramvaiHandler(2);
        MetrouHandler metrouCluj = new MetrouHandler(1);

        metrouCluj.setHandler(tramvaiCluj);
        tramvaiCluj.setHandler(troleibuzCluj);
        troleibuzCluj.setHandler(autobuzCluj);

        tramvaiCluj.afisareMijlocTransport(3);
        tramvaiCluj.afisareMijlocTransport(6);
    }
}