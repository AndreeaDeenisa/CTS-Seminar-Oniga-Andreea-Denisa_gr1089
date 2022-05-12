package clase_memento;

public class Autobuz {
    private String numeSofer;
    private double consumMediu;
    private int nrLocuri;
    private int anFabricatie;
    private String model;

    public Autobuz(String numeSofer, double consumMediu, int nrLocuri, int anFabricatie, String model) {
        this.numeSofer = numeSofer;
        this.consumMediu = consumMediu;
        this.nrLocuri = nrLocuri;
        this.anFabricatie = anFabricatie;
        this.model = model;
    }

    public void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

    public void setConsumMediu(double consumMediu) {
        this.consumMediu = consumMediu;
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "numeSofer='" + numeSofer + '\'' +
                ", consumMediu=" + consumMediu +
                ", nrLocuri=" + nrLocuri +
                ", anFabricatie=" + anFabricatie +
                ", model='" + model + '\'' +
                '}';
    }

    public MementoAutobuz creeazaMemento(){
        return new MementoAutobuz(this.numeSofer, this.consumMediu);
    }
    
    public void restaurareMemento(MementoAutobuz mementoAutobuz){
        this.numeSofer = mementoAutobuz.getNumeSofer();
        this.consumMediu = mementoAutobuz.getConsumMediu();
    }

    
}