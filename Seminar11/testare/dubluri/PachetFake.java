package dubluri;

import agentie.IPachetTuristic;

public class PachetFake implements IPachetTuristic{
	 private boolean isRezervare;
	 private int discountVarstnici;
     private double pret;

     public PachetFake() {}

     public PachetFake(boolean isRezervare, int discountVarstnici, double pret) {
         this.isRezervare = isRezervare;
         this.discountVarstnici = discountVarstnici;
         this.pret = pret;
     }

     @Override
     public boolean poateRezerva() {
         return false;
     }

     @Override
     public void aplicaDiscountVarstnici(int procent) {

     }

     @Override
     public double getPret() {
         return pret;
     }


     public void setRezervare(boolean rezervare) {
         isRezervare = rezervare;
     }

     public void setDiscountVarstnici(int discountVarstnici) {
         this.discountVarstnici = discountVarstnici;
     }

     public void setPret(double pret) {
         this.pret = pret;
     }
}
