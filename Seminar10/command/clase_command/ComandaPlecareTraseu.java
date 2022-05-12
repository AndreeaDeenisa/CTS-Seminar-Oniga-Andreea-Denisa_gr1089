package clase_command;

public class ComandaPlecareTraseu implements Command{
	private Autobuz autobuz;
	private int nrLinie;
	
	public ComandaPlecareTraseu(Autobuz autobuz, int nrLinie) {
		super();
		this.autobuz = autobuz;
		this.nrLinie = nrLinie;
	}

	@Override
	public void executa() {
		autobuz.pleacaInCursa(nrLinie);
	}
	
	
}
