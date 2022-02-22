package sources.animals;

public class Girafa extends Animal {

	public Girafa(String nume) {
		super(nume);
	}

	@Override
	public void mananca(String mancare) {
		System.out.println("Girafa "+ this.getNume() + " mananca "+ mancare);
	}	
}
