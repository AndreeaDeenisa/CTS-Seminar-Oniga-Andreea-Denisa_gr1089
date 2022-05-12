package clase_command;

import java.util.ArrayList;
import java.util.List;

public class Operator {
	List<Command> lista;

	public Operator() {
		super();
		this.lista = new ArrayList<>();
	}

	public void invocaComanda(Command command) {
		lista.add(command);
	}

	public void executaComanda() {
		if(lista.size()>0) {
			lista.get(0).executa();
			lista.remove(0);
		}
	}
}
