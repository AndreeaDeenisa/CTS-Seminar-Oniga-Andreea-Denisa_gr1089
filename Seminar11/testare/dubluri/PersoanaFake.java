package dubluri;

import persoana.IPersoana;

public class PersoanaFake implements IPersoana{
	private String valoareGetSex;
	private int valoareGetVarsta;
	private boolean valoareCheckCNP;

    public PersoanaFake() { }

    public PersoanaFake(String valoareGetSex, int valoareGetVarsta, boolean valoareCheckCNP) {
        this.valoareGetSex = valoareGetSex;
        this.valoareGetVarsta = valoareGetVarsta;
        this.valoareCheckCNP = valoareCheckCNP;

    }

    public void setValoareGetSex(String valoareGetSex) {
        this.valoareGetSex = valoareGetSex;
    }

    public void setValoareGetVarsta(int valoareGetVarsta) {
        this.valoareGetVarsta = valoareGetVarsta;
    }

    public void setValoareCheckCNP(boolean valoareCheckCNP) {
        this.valoareCheckCNP = valoareCheckCNP;
    }

    @Override
    public String getSex() {
        return valoareGetSex;
    }

    @Override
    public int getVarsta() {
        return valoareGetVarsta;
    }

    @Override
    public boolean checkCNP() {
        return valoareCheckCNP;
    }
}
