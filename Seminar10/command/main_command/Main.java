package main_command;

import clase_command.Operator;
import clase_command.Autobuz;
import clase_command.ComandaPlecareTraseu;
import clase_command.Command;

public class Main {

	public static void main(String[] args) {
		Operator operator = new Operator();
		Autobuz autobuz = new Autobuz("bmw");
		Autobuz autobuz1 = new Autobuz("audi");
		Autobuz autobuz2 = new Autobuz("renault");
		
		ComandaPlecareTraseu comandaPlecareTraseu = new ComandaPlecareTraseu(autobuz,1);
		operator.invocaComanda(comandaPlecareTraseu);
		operator.invocaComanda(new ComandaPlecareTraseu(autobuz2, 2));
		operator.invocaComanda(new ComandaPlecareTraseu(autobuz1, 3));
		operator.invocaComanda(new ComandaPlecareTraseu(autobuz1, 4));
		operator.invocaComanda(new ComandaPlecareTraseu(autobuz2, 2));
		operator.invocaComanda(new ComandaPlecareTraseu(autobuz, 2));
		
		operator.executaComanda();
		operator.executaComanda();
		operator.executaComanda();
		operator.executaComanda();
		operator.executaComanda();
		operator.executaComanda();	

	}

}
