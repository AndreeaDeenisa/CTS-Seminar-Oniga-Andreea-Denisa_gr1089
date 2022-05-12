package clase_chain;

public class AutobuzHandler extends Handler{
    public AutobuzHandler(int limita) {
        super(limita);
    }

    @Override
    public void afisareMijlocTransport(int distanta) {
        if(distanta < super.limita){
            System.out.println("Poti sa folosesti autobuzul");
        }
        else{
            super.nextHandler.afisareMijlocTransport(distanta);
        }
    }
}