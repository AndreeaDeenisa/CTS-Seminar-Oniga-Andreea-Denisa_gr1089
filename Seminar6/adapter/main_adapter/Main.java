package main_adapter;
import autobuz.AdaptorValidatorMetrou;
import autobuz.AdaptorValidatorObiecte;
import autobuz.Autobuz;
import autobuz.ValidatorAutobuz;
import metrou.ValidatorMetrou;

public class Main {
	 public static void main(String[] args) {
	        Autobuz autobuz = new Autobuz();
	        ValidatorMetrou metrou = new ValidatorMetrou();

	        //Adaptor de obiecte
	        AdaptorValidatorObiecte adaptorObiecte = new AdaptorValidatorObiecte(metrou);
	        adaptorObiecte.validareBilet();
	        adaptorObiecte.validareAbonament();

	        // Adaptor de clase
	        AdaptorValidatorMetrou validator = new AdaptorValidatorMetrou();
	        validator.validareBilet();
	        validator.validareAbonament();
	    }
}
