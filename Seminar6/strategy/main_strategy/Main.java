package main_strategy;

import clase_strategy.PlataCard;
import clase_strategy.PlataSTB;
import clase_strategy.Validator;

public class Main {

	public static void main(String[] args) {
		PlataCard plataCard = new PlataCard();
		Validator validator = new Validator(25);
		validator.valideazaCalatorie();
		validator.setModalitatePlata(plataCard);
		validator.valideazaCalatorie();

	}

}
