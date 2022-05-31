package dubluri;

import agentie.IPachetTuristic;
import persoana.IPersoana;

public class PachetDummy implements IPachetTuristic{

  @Override
    public boolean poateRezerva() {
        return false;
    }

    @Override
    public void aplicaDiscountVarstnici(int procent) {

    }

    @Override
    public double getPret() {
        return (Double) null;
    }

}
