package clase_flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<Integer, Linie> linii;

    public FlyweightFactory() {
        linii = new HashMap<>();
    }

    public Linie getLinie(int nrLinie){
        if(linii.get(nrLinie) == null){
            linii.put(nrLinie, new Linie(nrLinie, "PrimaStatie", "UltimaStatie"));
        }
        return linii.get(nrLinie);
    }
}