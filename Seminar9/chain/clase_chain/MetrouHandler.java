package clase_chain;

public class MetrouHandler extends Handler{
    public MetrouHandler(int limita) {
        super(limita);
    }

    @Override
    public void afisareMijlocTransport(int distanta) {
        if(distanta < super.limita) {
            System.out.println("Poti folosi metroul!");
        }
        else{
        	nextHandler.afisareMijlocTransport(distanta);
        }
    }
}
