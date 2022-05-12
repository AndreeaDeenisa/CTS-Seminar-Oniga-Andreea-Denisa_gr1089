package clase_memento;

import java.util.ArrayList;
import java.util.List;

public class Autobaza {
    private List<MementoAutobuz> listaMemento;

    public Autobaza() {
        this.listaMemento = new ArrayList<>();
    }

    public void addMemento(MementoAutobuz mementoAutobuz){
        this.listaMemento.add(mementoAutobuz);
    }

    public MementoAutobuz getMemento(int index){
        return listaMemento.get(index);
    }
}