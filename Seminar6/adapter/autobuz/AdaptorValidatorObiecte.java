package autobuz;

import metrou.ValidatorMetrou;

public class AdaptorValidatorObiecte implements ValidatorAutobuz{
	private ValidatorMetrou validatorMetrou;

	public AdaptorValidatorObiecte(ValidatorMetrou validatorMetrou) {
		super();
		this.validatorMetrou = validatorMetrou;
	}
	
	public void validareAbonament() {
		validatorMetrou.validareAbonament();
	}
	
	public void validareBilet() {
		validatorMetrou.validareCalatorie();
	}

}
