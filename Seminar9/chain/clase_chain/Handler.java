package clase_chain;

public abstract class Handler {
    protected Handler nextHandler;
    protected int limita;

    public Handler(int limita) {
        this.limita = limita;
        this.nextHandler = null;
    }

    public void setHandler(Handler nextHandler){
        this.nextHandler = nextHandler;
    }

    public void setLimita(int limita){
        this.limita = limita;
    }

    public abstract void afisareMijlocTransport(int distanta);
}