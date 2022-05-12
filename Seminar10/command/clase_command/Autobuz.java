package clase_command;

public class Autobuz {
	private String model;

	public Autobuz(String model) {
		super();
		this.model = model;
	}

	public void pleacaInCursa(int nrLinie) {
		System.out.println("Autobuzul " + model + " pleaca pe linia " + nrLinie);
	}

}
