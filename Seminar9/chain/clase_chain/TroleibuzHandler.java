package clase_chain;

public class TroleibuzHandler extends Handler{

    public TroleibuzHandler(int limita) {
        super(limita);
    }

    @Override
    public void afisareMijlocTransport(int distanta) {
        if(distanta < super.limita){
            System.out.println("Poti folosi troleibuzul");
        }
        else{
        	nextHandler.afisareMijlocTransport(distanta);
        }
    }
}