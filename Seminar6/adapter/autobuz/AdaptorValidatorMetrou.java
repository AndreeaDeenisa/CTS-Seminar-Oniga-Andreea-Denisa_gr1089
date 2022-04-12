package autobuz;

import metrou.ValidatorMetrou;

public class AdaptorValidatorMetrou extends ValidatorMetrou implements ValidatorAutobuz {
    @Override
    public void validareBilet() {
        super.validareCalatorie();
    }
}